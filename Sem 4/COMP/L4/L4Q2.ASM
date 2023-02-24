data segment
	q dw 0
	a dW 10F2h
	b db 0FFh
data ends

code segment
	assume cs:code, ds:data
	start:
		mov ax, data
		mov ds, ax

		mov ax, a
		mov bl,b
		div bl
		mov q,ax

		mov ah,4ch
		int 21h
		code ends
		end start