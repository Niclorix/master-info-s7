
close all;

figure('Name', 'parabole et sa derivee') 
hold on;

axis auto;
X = -100:100;
Y = parabole(X);
%plot(X, Y)


dY = diff(Y)./diff(X);
length(X)
length(dY)

% Comparer la courbe suivante :
%plot(X(:, 1:length(X)-1),dY,'r')


% Avec celle-ci
Yd = 2*X;
%plot(X, Yd, 'b')

figure('Name', 'animation parabole')

% en un point de la parabole, on affiche la tangente (le coefficient directeur est la derivee)
close all;
hold on;

plot(X,Y)

for i=-80:20:80
    
    plot(i,parabole(i),'or');
    
    tg =2*i*10+parabole(i);
    
    plot([i;i+10],[parabole(i);tg],'r')
    
    pause(0.2)
end

%%EX1.1%%

coef = [3 1 1];
x = [10 20 30];
valeurPolynome(x, coef)

function[valeur] = valeurPolynome(x, coefs)
l = length(coefs);
puissance = 0:l-1
tx = repmat(x, l, 1);
valeur = coefs*(tx.^(puissance')); 
end


% ' pour faire la transposée
%transposée d'une matrice = colonnes deviennent ligne et vice versa

%%EX1.3%%

%coeffDeriv = derivPoly(coef)


