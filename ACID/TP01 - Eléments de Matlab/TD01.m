%% EXERCICE 1 : Creation de tableaux, accès à un élément

% A tester
% 
% % L'espace ou la virgule sont equivalents pour definir les tableaux.
% 

L1 = [10 20 30 40];
L2 = [5, 10, 15, 20];
 
% 
% % Creation d'un vecteur colonne
% % Le point virgule permet de passer a la ligne suivante.
% 

C1 = [10; 20; 30; 40];

 
%
% % Acces a un element d'un tableau. Les indices commencent a 1
%
 
L2(1);
C1(2);

% 
% % definition d'une matrice 3x3
%
 
M1 = [ 10 20 30 ; 40 50 60; 70 80 90];

% 
% % taille d'un tableau
% 

size(L1);
size(C1);
size(M1);

% 
% % La taille est une structure 
% % Premiere valeur : le nombre de lignes
% % Seconde valeur  : le nombre de colonnes
% 
 
size(L1, 1);
size(L1, 2);
 
size(C1, 1);
size(C1, 2);
 
nbLig = size(M1, 1);
nbCol = size(M1, 2);

% 
% % Acceder aux elements d'un tableau 2D (indiceLigne, indiceColonne)
% 
% 

iL = 2;
iC = 3;
M1(iL, iC);

%
% % Extraire une colonne
%
 
M1(:,1);
M1(:,3);
 
% 
% % Extraire une ligne 
% 
 
M1(2,:);

%
% %  Extraire un sous-tableau
%
 
M1(2:3,1:2);
 
% 
% % Supprimer des lignes. Modifie le tableau
%
M1(2:3,:) = [];
% 
% % Supprimer des colonnes
% 
M1(:,2:3) = [];
% 
% % Fonctions predefinies de creation de tableaux
% 
 
M2 = zeros(3); % tableau 3x3!
 
M3 = zeros(1,3);
 
M4 = ones(2,4);

Id = eye(2,3); % tableau 2x3 rempli de 0 avec 1 sur diagonale depuis haut gauche 

%
% % Tableau de valeurs parcourant un intervalle
%
 
V1 = 1:10; % pas entier de 1 par defaut

V2 = 1:0.5:5;

M5 = [1:1:5;2:1:6];

%
% %  Creer un tableau à partir de ses lignes
% 

T1 = [5 1 3];
T2 = [10 4 2];
T3 = [3 5 0];
M6 = [T1; T2; T3];

% ou 
M6 =  vertcat(T1, T2, T3);

% 
% % Concaténer des tableaux 1D
%

M7 = [T1 T2 T3];
% ou
M7 = horzcat(T1, T2, T3);
 


%  
% % Dupliquer une matrice
% 
 
M8 = [1 2 3 ; 4 5 6];
M9 = repmat(M8, 3, 2);

%  
% % Redimensionner une matrice
% % le nombre d'elements est le meme avant et apres
% % le parcours colonne par colonne donne la meme suite d'elements
%

M10 = reshape(M9, size(M9,2)/2, size(M9,1)*2);

% 
% % Creer un tableau aleatoirement.
%  

V3 = rand(1, 10); % parametres = dimension du tableau

M11 = rand(5, 3);

M12 = randi(10, 5, 10);

%% EXERCICE 2 : Trier un tableau 

% A tester

V4 = sort(V3);

M13 = reshape(V4, 2, 5);

sort(M12, 1); % chaque colonne est triée

sort(M12, 2); % chaque ligne est triée


% A ecrire
M = randi(10,4,9);
h = size(M,1);
w = size(M,2);
V = reshape(M, 1, h*w); %met à la suite chaque colonnes sous forme de ligne
U = sort(V); %tri croissant de V
Mt = reshape(U, w, h);
%reforme le tableau U dans une matrice de 9 colonnes et 4 lignes
Mt = transpose(Mt); %échange les lignes et les colonnes
%de façon à ce que la ligne 1 devienne la colonne 1 pour chaque lignes et
%colonnes
 
%% EXERCICE 3 : Indexation logique

%M1*M2 est la multiplication matricielle
%M1.*M2 multiplie par eléments

% A tester
%
% % Chercher des elements dans un tableau, B1 est un tableau de booleens
% 

V5 = randi(25,1,200);
B1 = V5>20; % met 1 si la valeur > 20, sinon met 0

% 
% % V6 contient les valeurs de V5 qui sont superieures a 20
%

V6 = V5(B1); % V6 est la liste de toutes les valeurs de V5 > 20
%en gros, il utilise VB1 pour définir quelles valeurs sont gardées (ici,
%toutes les valeurs de V5 où B1 à un 1 sont gardées)
% ou
%V6 = V5(V5>20)

%
% % Index contient les indices dans V5 ou les elements sont superieurs a 20. 
%
Index = find(V5 > 20);
%liste des indices des valeurs de V5 superieur à 20

% A ecrire
Va = randi(10,1,10);
Vb = randi(10,1,10);

Vmax = max(Va, Vb);
Vmin = min(Va, Vb);

% sans utiliser la fonction max

t = Va > Vb;
Umax = t.*Va + ~t.*Vb;

%% EXERCICE 4 : opérations arithmétiques sur vecteurs et matrices

% A tester

Mat1 = randi(20, 5, 5);

Mat2 = randi (20, 5, 5);

VecLigne = randi (20, 1, 5);

VecCol = VecLigne'; % equivalent a VecCol = transpose (VecLigne)
 
%
% % Addition et soustraction - fonctionne sur des matrices de meme taille
%
 %%%%%%%%%%%J'EN SUIS ICI%%%%%%%%%%%%ù
   Mat3 = Mat1 + Mat2;
   Mat4 = Mat1 - Mat2;
   
%
% % Somme des éléments d'une matrice
% 

 S1 = sum(VecLigne);
 S2 = sum(VecCol);
 S3 = sum(Mat1); % somme colonne par colonne
 S4 = sum(Mat1, 1); % idem 
% S5 = sum(Mat1, 2) % somme ligne par ligne


% 
% % Multiplication de deux matrices (attention a la coherence des dimensions)
% 

 Mat5 = Mat1*Mat2;

 Mat6 = Mat1 .* Mat2;

 Vec1 = Mat1 * VecCol;
 
 Vec2 = VecLigne * Mat2;
 
 Mat7 = VecCol * VecLigne;

 ProduitScalaire =  VecLigne * VecCol;

%
% % Inversion et resolution de systeme lineaire
% 

 InvMat3 = inv(Mat3); % inverser une matrice (si elle est inversible)


% Res = Mat3\VecCol
% ou
 Res1= InvMat3*VecCol;
 

%% EXERCICE 5 : affichage 

% A tester

%
% % Affichage d'une courbe définie par les coordonnées de ses points
%

X = -10:0.1:10;
Y = normpdf(X, 0, 1);

%plot(X, Y)
% ou 
%plot(X, Y, 'r--x');
% ou 
scatter(X, Y)

%
% % On peut superposer plusieurs affichage dans la meme figure
%

Y2 = normpdf(X, 3, 2);
hold on;
plot(X, Y)
plot(X, Y2)
hold off; 

%
% % On peut creer plusieurs figures en meme temps
%
close all; % pour fermer d'autres figures creees precedemment
figure('Name', 'loi normale de moyenne 0');
plot(X, Y);
figure('Name', 'loi normale de moyenne 3');
plot(X, Y2);
close all;

%
% % utilisation de la fonction parabole (fichier parabole.m)
%


axis auto;
X = -100: 100; %vecteur de -100 -99 ... 98 99 100
Y = parabole(X);
%plot(X, Y);

% ou 
%fplot('parabole',[-100 100]);

%
% % en 3D
%

close all;

mu = [0 0];
sigma = [2 1; 1 3];

x1 = -10:0.5:10;
y1 = -10:0.5:10;

[X,Y] = meshgrid(x1, y1);

Z = mvnpdf([X(:) Y(:)], mu, sigma);

S = reshape(Z,length(x1),length(y1));

surf(x1, y1, S);
% ou 
% scatter3(X(:), Y(:), Z)

% caxis([min(S(:))-.5*range(S(:)),max(S(:))]);

% axis([-10 10 -10 10 0 .2])

% xlabel('x'); ylabel('y'); zlabel('Probability Density');

% A ecrire
% ...

%% FINALE : Regression lineaire

close all;

m=40;
sizeNoise=10;
x = rand(m,1).*50+5;
noise = rand(m,1) * sizeNoise;
pente = 0.8;
c = 20;
y = c+pente*x + noise;
scatter(x, y);
hold on;

tmp = m*sum(x.*y)-(sum(x)*sum(y));
tmp2 = m*sum(x.*x)-(sum(x)*sum(x));
teta_1 = tmp/tmp2;
teta_0 = (sum(y)- teta_1*sum(x))/m;

x1=0;
y1=teta_0;

x2=50;
y2=teta_1*x2+teta_0;

plot([x1 x2],[y1 y2]);
hold on;

