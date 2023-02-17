data segment
	a dt 80123456789123456789h
	b dt 91234567789123456789h
	diff dt 20 dup(0)
	carry dB 00
data ends

code segment
	assume cs:code, ds:data
start:
	mov ax,data
	mov ds, ax

	mov si,00h
	clc
	mov cx,05

back:
	mov bx, a[si]
	sbb bx, b[si]
	mov diff[si],bx
	inc si
	inc si
	loop back

	adc carry,0
	mov al,carry

	mov ah, 4ch
	int 21h
	code ends
	end start

