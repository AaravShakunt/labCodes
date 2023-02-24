data segment
	mult dd 16 dup(?)
	a dw 1009h
	b dw 0002h
data ends

code segment
	assume cs:code, ds:data
	start:
		mov ax, data
		mov ds, ax

		mov ax, a
		mul b
		mov [mult], ax
		mov [mult+2], dx

		mov ah,4ch
		int 21h
		code ends
		end start
