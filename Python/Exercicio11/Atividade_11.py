class Atividade_09:

    num = int(input("Digite o número a ser verificado: "))

    var = num % 3

    if(var == 0):
        print("O número é triangular.")
    else:
        print("O número não é triangular. ")