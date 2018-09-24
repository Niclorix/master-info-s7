
close all;

figure('Name', 'parabole et sa derivee') 
hold on;

axis auto;
X = -100: 100;
Y = parabole(X);
plot(X, Y)


dY = diff(Y)./diff(X);
length(X)
length(dY)
0
% Comparer la courbe suivante :
plot(X(:, 1:length(X)-1),dY,'r')

% Avec celle-ci
Yd = 2*X;
plot(X, Yd, 'g')

hold off

figure('Name', 'animation parabole')

% en un point de la parabole, on affiche la tangente (le coefficient directeur est la derivee)

hold on;

plot(X,Y)

for i=-80:20:80
    
    plot(i,parabole(i),'or');
    
    tg =2*i*10+parabole(i);
    
    plot([i;i+10],[parabole(i);tg],'r')
    
    pause(0.2);
end


coef = [3 1 1]
x = [10 20 30]
puissance = [0 1 2]

l = length(coef)
tx = repmat(x, l, 1)
valeur = coef*(tx.^(puissance'))

