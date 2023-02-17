data segment
	a dw 1223h
	b dw 1222h
	diff dw 4 dup(0)
	carry db 00
data ends

code segment
	assume cs:code, ds:data 
start:
	mov ax,data
	mov ds, ax

	mov ax, a
	sbb ax, b
	mov diff, ax
	adc carry,0
	mov ah, 4ch
	int 21h
	code ends
	end start
