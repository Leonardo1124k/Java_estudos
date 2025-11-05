# Arquivo: desafio98
from time import sleep

def contador(ini, fim, pas):
    pas = abs(pas)
    if ini <= fim:
        for i in range(ini,fim+1,pas):
            print(i, end=" ")
    elif ini > fim:
        for i in range(ini,fim-1,-pas):
            print(i, end=" ")
    print("Fim!")
    
        
def linha():
    print("=" * 30)

linha()
print("Contagem de 1 até 10 de 1 em 1: ")
contador(0,11,1)
linha()
print("Contagem de 10 até 0 de 2 em 2: ")
contador(10,-1,-2)
linha()
print("Agora é sua vez de personalizar a contagem!")
ini = int(input("Inicio: "))
fim = int(input("Fim: "))
pas = int(input("Passo: "))
linha()
print(f"Contagem de {ini} até {fim} de {abs(pas)} em {abs(pas)}")
contador(ini,fim,pas)