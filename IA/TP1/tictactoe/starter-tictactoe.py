# -*- coding: utf-8 -*-

import time
import Tictactoe
from random import randint,choice

def RandomMove(b):
    '''Renvoie un mouvement au hasard sur la liste des mouvements possibles'''
    return choice(b.legal_moves())

def deroulementRandom(b):
    '''Effectue un déroulement aléatoire du jeu de morpion.'''
    print("----------")
    print(b)
    if b.is_game_over():
        res = getresult(b)
        if res == 1:
            print("Victoire de X")
        elif res == -1:
            print("Victoire de O")
        else:
            print("Egalité")
        return
    b.push(RandomMove(b))
    deroulementRandom(b)
    b.pop()

# EXERCICE 1.1
nbnoeuds=0
nbgames=0
def devtotal(b):
    global nbnoeuds, nbgames
    nbnoeuds+=1
    if b.is_game_over():
        nbgames+=1
        return
    for m in b.legal_moves():
        b.push(m)
        devtotal(b)
        b.pop()

# ##CORRECTION DE JSPQUOI
# def minGagnant(board):
#     if game_is_over(board):
#         return getresult(b) == 1
#     all_true = True
#     for move in:
#         b.push(move)
#         if maxGagnant(2)== False:
#             return False
#         b.pop()
#     return True
#
# def maxGagnant(board):
#     if b.game_is_over():
#         return get_result(b)
#     vaeur = 1
#     for move in b.legal_moves():
#         b.push(move)
#         meilleur = max(meilleur, minGagnant(b))
#         b.pop()
#         return meilleur
# ##fin  correction


def getresult(b):
    '''Fonction qui évalue la victoire (ou non) en tant que X. Renvoie 1 pour victoire, 0 pour
       égalité et -1 pour défaite. '''
    if b.result() == b._X:
        return 1
    elif b.result() == b._O:
        return -1
    else:
        return 0


board = Tictactoe.Board()
print(board)

### Deroulement d'une partie aléatoire
deroulementRandom(board)

print("Apres le match, chaque coup est défait (grâce aux pop()): on retrouve le plateau de départ :")
print(board)

devtotal(board)
print 'Parties %d, Noeuds %d' % (nbgames, nbnoeuds)