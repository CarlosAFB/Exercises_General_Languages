class Atividade_04:

    comb = str(input("Escolha o combustivel digitando seu caracter coreespondente: "
          + "\n e) Etanol,"
          + "\n g) Gasolina,"
          + "\n d) Diesel;"
          + "\n Sua escolha: "))

    lt = float(input("Digite a quantidade de litros: "))

    if(comb == "e"):
        print("Valor a pagar R$ ", lt * 2.90)
    elif(comb == "g"):
        print("Valor a pagar R$", lt * 4.30)
    elif(comb == "d"):
        print("Valor a pagar R$", lt * 3.60)
    else:
        print("Você digitou um caractere inválido.")