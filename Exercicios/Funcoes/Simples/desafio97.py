# Arquivo: desafio97
def escreva(palavra):
    quant = len(palavra) + 5
    print("-" * quant)
    print(f"{palavra:^{quant}}")
    print("-" * quant)

escreva(input("Escreva uma palavra: "))