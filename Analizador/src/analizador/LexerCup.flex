package analizador;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
private Symbol symbol(int type, Object value){
return new Symbol(type, yyline, yycolumn, value);
}
private Symbol symbol(int type){
return new Symbol(type, yyline, yycolumn);
}
%}
%%