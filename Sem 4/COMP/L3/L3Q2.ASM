data segment
	a dB 93h
	b dB 0A2h
	sum dB 2 dup(0)
	carry dB 00
data ends

code segment
	assume cs:code, ds:data
start:
	mov ax,data
	mov ds, ax

	mov al, a
	add al, b
	mov sum, al
	adc sum+2,0
	mov al, carry
	mov ah, 4ch
	int 21h
	code ends
	end start
