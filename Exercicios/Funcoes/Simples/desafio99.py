# Arquivo: desafio99
# from time import sleep
from random import randint

# def linha():
#     print("-" * 40)

# def maior(num):
#     for i in num:

# #Programa principal
# maior([randint(0,10) for i in range(randint(0,10))])

from time import sleep

def maior(*num):
    cont = maior = 0
    print("==" * 30)
    print("Analisando os valores passados...")
    for valor in num:
        print(f"{valor} ", end="", flush=True)
        sleep(0.3)
        if cont == 0:
            maior = valor
        else:
            if valor > maior:
                maior = valor
        cont += 1
    print(f"Foram informados {cont} valores ao todo.")
    print(f"O maior valor informado foi {maior}.")

maior(2,3,4,5,7,1)
maior(4,7,7,7,7,7)