DATA SEGMENT
    num1 DW 0A123H
    num2 DW ?
DATA ENDS

CODE SEGMENT
    ASSUME CS:CODE, DS:DATA
    START:
        MOV AX, DATA; MOVE BASE ADDRESS OF DATA SEGMENT TO AX WHICH
        MOV DS, AX; COPIED BASE ADDRESS TO DS
        MOV BX, num1
        MOV num2, BX
        MOV AH, 4CH
        INT 21H
        CODE ENDS
        END START
