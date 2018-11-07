import time
import chess
from random import randint, choice

def randomMove(b):
    '''Renvoie un mouvement au hasard sur la liste des mouvements possibles. Pour avoir un choix au hasard, il faut
    construire explicitement tous les mouvements. Or, generate_legal_moves() nous donne un iterateur.'''
    return choice([m for m in b.generate_legal_moves()])

def deroulementRandom(b):
    '''Deroulement d'une partie d'ehecs au hasard des coups possibles. Cela va donner presque exclusivement
    des parties tres longues et sans gagnant. Cela illustre cependant comment on peut jouer avec la librairie
    tres simplement.'''
    print("------------")
    print(b)
    if b.is_game_over():
        print("Resultat : ", b.result())
        return
    b.push(randomMove(b))
    deroulementRandom(b)
    b.pop()

board = chess.Board()
deroulementRandom(board)
