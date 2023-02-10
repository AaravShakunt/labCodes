Data Segment
  array1 db 10H, 11H, 12H, 13H, 14H, 15H, 16H, 17H, 18H, 19H
  array2 db 00H, 01H, 02H, 03H, 04H, 05H, 06H, 07H, 08H, 09H
Data ends

Code Segment
    assume cs:code, ds:data
    start:
        MOV AX, DATA
        MOV DS, AX

        LEA SI, array1
        LEA DI, array2
        mov cx, 0AH
        BACK:
            mov BL, [SI]
            mov AL, [DI]
            mov [DI], BL
			mov [SI], AL
            INC SI
            INC DI
            Loop back
       mov AH,4CH
       INT 21H
       Code ends
       end start
