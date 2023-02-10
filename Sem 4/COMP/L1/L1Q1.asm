CODE SEGMENT
        ASSUME CS:CODE
START:
        MOV AL,7AH
        MOV BL,AL
        MOV AH,4CH
        INT 21H
        CODE ENDS
        END START
