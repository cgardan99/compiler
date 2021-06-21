grammar tiny;

program: PROGRAM LEFT_PARANTHESIS declarationlist statementlist RIGHT_PARANTHESIS;
declarationlist: declarationlist declaration | declaration | /* empty */;
declaration: typespecifier vardeclaration EOL;
vardeclaration: vardeclaration COMMA ID | ID;
typespecifier: INT | BOOL | FLOAT;

statementlist: statementlist statement | /* empty */;
statement: selectionstmt | iterationstmt | repetitionstmt | sentread | sentwrite | block | assign;

assign: ID ASSIGNMENT bexpresion EOL;

selectionstmt: IF evaluacion THEN block FI | IF evaluacion THEN block ELSE block FI;
iterationstmt: WHILE evaluacion block;
repetitionstmt: DO block UNTIL evaluacion EOL;

evaluacion: LEFT_BRACKET bexpresion RIGHT_BRACKET;

block: LEFT_PARANTHESIS statementlist RIGHT_PARANTHESIS;

expreval: LEFT_BRACKET expression RIGHT_BRACKET;
sentread: READ ID EOL;
sentwrite: WRITE bexpresion EOL;
bexpresion: bexpresion OR bterm | bterm;
bterm: bterm AND notfactor | notfactor;
notfactor: bfactor | NOT bfactor;
bfactor: TTRUE | TFALSE | simpleexpression;

expression: var ASSIGNMENT expression | simpleexpression;
var: ID | ID LEFT_SQR_BRACKET expression RIGHT_SQR_BRACKET;
simpleexpression: additiveexpression relop additiveexpression | additiveexpression;
relop: LESS_THAN | LESS_OR_EQUAL | GREATER_THAN | GREATER_OR_EQUAL | EQUALS | NOT_EQUALS;
additiveexpression: additiveexpression addop term | term;
addop: PLUS | MINUS;
term: term mulop factor | factor;
mulop: MULTIPLY | DIVIDE;
factor: expreval | var | call | NUM | ID;
call: ID LEFT_BRACKET args RIGHT_BRACKET;
args: arglist |  /* empty */;
arglist: arglist COMMA expression | expression;

IF: 'if';
ELSE: 'else';
INT: 'int';
FLOAT: 'float';
BOOL: 'bool';
VOID: 'void';
WHILE: 'while';
PROGRAM: 'program';
THEN: 'then';
FI: 'fi';
TTRUE: 'true';
TFALSE: 'false';
AND: 'and';
OR: 'or';
NOT: 'not';
WRITE: 'write';
READ: 'read';
DO: 'do';
UNTIL: 'until';
PLUS: '+';
MINUS:'-';
MULTIPLY:'*';
DIVIDE: '/';
LESS_OR_EQUAL: '<=';
LESS_THAN: '<';
GREATER_OR_EQUAL: '>=';
GREATER_THAN: '>';
EQUALS: '==';
NOT_EQUALS: '!=';
ASSIGNMENT: '=';
EOL: ';';
COMMA: ',';
LEFT_PARANTHESIS: '{';
RIGHT_PARANTHESIS: '}';
LEFT_BRACKET: '(';
RIGHT_BRACKET: ')';
LEFT_SQR_BRACKET: '[';
RIGHT_SQR_BRACKET: ']';
ID: [a-zA-Z0-9][a-zA-Z0-9]*;
NUM: [0-9][0-9]*;
COMMENT
: '/*' .*? '*/' -> skip
;
LINE_COMMENT
: '//' ~[\r\n]* -> skip
;

WS
:
	[ \t\r\n]+ -> skip
;