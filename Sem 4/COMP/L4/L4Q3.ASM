data segment
	q dw 0
	a dW 1234h
	b dw 000Ah
	c dd 0
data ends

code segment
	assume cs:code, ds:data
	start:
		mov ax, data
		mov ds, ax

		mov CX, b
		mov AX,0
		mov DX,0
		mov BX,a
		up:
			add AX,BX
			adc DX,0
			loop up
		mov word ptr C, AX
		mov c+2,dx

		mov ah,4ch
		int 21h
		code ends
		end start



