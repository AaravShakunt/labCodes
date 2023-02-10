Data Segment
  array1 dw 1000H, 1100H, 1200H, 1300H, 1400H
  array2 dw 2 dup(?)
Data ends

Code Segment
    assume cs:code, ds:data
    start:
        MOV AX, DATA
        MOV DS, AX

        LEA SI, array1
        LEA DI, array2
        add SI, 09H
        add DI, 03H
        mov cx, 05H
        BACK:
            mov BX, [SI]
            mov [DI], BX
            DEC SI
            DEC SI
            DEC DI
            DEC DI
            Loop back
       mov AH,4CH
       INT 21H
       Code ends
       end start

        
