data segment
	a dd 91234567h
	b dd 91234567h
	sum dd 8 dup(0)
	carry dB 00
data ends

code segment
	assume cs:code, ds:data
start:
	mov ax,data
	mov ds, ax

	mov si,00h
	clc
	mov cx,02

back:
	mov bx, a[si]
	adc bx, b[si]
	mov sum[si],bx
	inc si
	inc si
	loop back

	adc carry,0
	mov al,carry

	mov ah, 4ch
	int 21h
	code ends
	end start
