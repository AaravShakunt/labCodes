Data Segment
  array1 db 10H, 11H, 12H, 13H, 14H, 15H, 16H, 17H, 18H, 19H
  array2 db 8 dup(?)
Data ends

Code Segment
    assume cs:code, ds:data
    start:
        MOV AX, DATA
        MOV DS, AX

        LEA SI, array1
        LEA DI, array2
        add SI, 09H
        add DI, 07H
        mov cx, 0AH
        BACK:
            mov BX, [SI]
            mov [DI], BX
            DEC SI
            DEC DI
            Loop back
       mov AH,4CH
       INT 21H
       Code ends
       end start
