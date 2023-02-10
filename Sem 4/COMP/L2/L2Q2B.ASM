Data Segment
  array1 dw 1000H, 1100H, 1200H, 1300H, 1400H
  array2 dw 5 dup(?)
Data ends

Code Segment
    assume cs:code, ds:data
    start:
        MOV AX, DATA
        MOV DS, AX

        LEA SI, array1
        LEA DI, array2
        mov cx, 05H
        BACK:
            mov BX, [SI]
            mov [DI], BX
            INC SI
            INC SI
            INC DI
            INC DI
            Loop back
       mov AH,4CH
       INT 21H
       Code ends
       end start
