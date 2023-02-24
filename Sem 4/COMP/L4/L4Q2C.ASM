data segment
	q dw 0
	a dd 100010F2h
	b dw 10FFh
data ends

code segment
	assume cs:code, ds:data
	start:
		mov ax, data
		mov ds, ax

		mov ax, [a]
		mov dx, [a+2]
		mov bx,b
		div bx
		;mov q,ax

		mov ah,4ch
		int 21h
		code ends
		end start