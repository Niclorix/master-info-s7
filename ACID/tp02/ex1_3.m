close all;

figure('Name', 'animation parabole')

X = -100:100;
Y = parabole(X);
hold on
plot(X,Y)

for i=-80:20:80
    %tout les 20 x, pose un point sur la parabole
    %puis trace la tangante de cette parabole en ce point
    
    plot(i,parabole(i),'or');
    %met une orbe rouge au point voulu
    
    tg =2*i*10+parabole(i);
    
    plot([i;i+10],[parabole(i);tg],'r')
    %trace la tangante à partire du point
    
    pause(0.2)
end

%%EX1.1%%

coef = [3 1 1];
x = [10 20 30];
puissance = [0 1 2];

l = length(coef);
tx = repmat(x, l, 1);
valeur = coef*(tx.^(puissance')); % ' pour faire la transposée
%transposée d'une matrice = colonnes deviennent ligne et vice versa

%%EX1.3%%

%coeffDeriv = derivPoly(coef)


