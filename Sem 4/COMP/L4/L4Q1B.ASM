data segment
	mult dw 8 dup(?)
	a db 0F2h
	b db 02h
data ends

code segment
	assume cs:code, ds:data
	start:
		mov ax, data
		mov ds, ax

		mov al, a
		imul b
		mov [mult], ax

		mov ah,4ch
		int 21h
		code ends
		end start
