class Atividade_05:

    nome = str(input("Digite o seu nome: "))
    salario = float(input("Digite seu salário: "))

    if (salario <= 1000):
        print("O novo salario do(a) ", nome, "é de R$", (salario + (salario * 0.3)))
    elif(salario > 1000 and salario <= 2000):
        print(" O novo salário  do(a) ", nome, "é de R$", (salario +(salario * 0.2)))
    elif(salario < 2000):
        print(" O novo salário  do(a) ", nome, "é de R$", (salario +(salario * 0.2)))

