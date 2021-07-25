class Atividade_06:

    sm = 998.0
    ir = 0.0

    nome = str(input("Digite o nome do funcionário: "))
    horas = int(input("Digite as horas trabalhadas: "))

    extra = 15.73 * horas
    sb = (sm + sm) + extra

    if(sb <= 28226.65):
     ir = 0.075
    elif(sb > 2826.66 and sb < 3751.05):
     ir = 0.15
    elif(sb > 3751.06 and 4664.08):
     ir = 0.255
    else:
     ir = 0.275

    if (sb <= 2919.72):
        inss = 0.09
    else:
        inss = 0.11

    sl = sb-((sb*inss)+(sb*ir))

    print(nome + ", seu salario bruto é de R$", sb)
    print(nome + ", seu salario bruto é de R$", sl)
