# Arquivo: desafio96
def mostraLinha():
    print("-" * 30)
def terreno(larg,comp):
    area = larg * comp
    print(f"A área do terreno {larg}x{comp}m é de {area}m².")

mostraLinha()
print(f"{"TERRENOS FRANCA - SP":^30}")
mostraLinha()
larg = float(input("Largura (m): "))
comp = float(input("Comprimento (m): "))
terreno(larg,comp)
