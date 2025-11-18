#Funções em python
import random
import math
import datetime

def imprimir():
    print("Função sem parâmetro")
imprimir()

def somar(a,b):
    return a + b

def multiplicacao(x,y):
    resultado = x * y
    return resultado

print (somar(5,2))
print(multiplicacao(4,3))


print(random.randint(1,100))
#estrutura for
print(math.sqrt(16))
#raiz quadrada

print(datetime.datetime.now())
agora = datetime.datetime.now()
print(agora.year)
print(agora.month)
print(agora.day)
print(agora.hour)
print(agora.minute)
print(agora.second)
print(agora.strftime("%d/%m/%y"))