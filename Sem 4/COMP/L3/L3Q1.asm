data segment
	a dw 0023h
	b dw 00A2h
	sum dw 4 dup(0)
	carry db 00
data ends

code segment
	assume cs:code, ds:data 
start:
	mov ax,data
	mov ds, ax

	mov ax, a
	add ax, b
	mov sum, ax
	adc carry,0
	mov ah, 4ch
	int 21h
	code ends
	end start
