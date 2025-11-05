# Arquivo: desafio100
from random import randint
from time import sleep

def sorteia(lista):
    print("Sorteando 5 valores da lista: ", end="")
    for cont in range(0,5):
        n = randint(1,10)
        lista.append(n)
        print(f"{n} ", end='', flush=True)
        sleep(0.5)
    print("Pronto! ")

def somaPar(lista):
    soma = 0
    listapar = []
    for valor in lista:
        if valor % 2 == 0:
            soma += valor
            listapar.append(str(valor))
    print(f"Somando os valores pares de {lista}, temos {' + '.join(listapar)} -> {soma}")
    
numeros = list()
sorteia(numeros)
somaPar(numeros)