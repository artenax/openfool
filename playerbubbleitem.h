#ifndef PLAYERBUBBLEITEM_H
#define PLAYERBUBBLEITEM_H

#include <QObject>
#include <QGraphicsEllipseItem>
#include <QGraphicsSimpleTextItem>

class PlayerBubbleItem : public QObject, public QGraphicsEllipseItem
{
    Q_OBJECT

public:
    PlayerBubbleItem(QPointF pos, QGraphicsItem *parent = nullptr);

    QString text() const;
    void setText(const QString &text);

    void paint(QPainter *painter, const QStyleOptionGraphicsItem *option,
               QWidget *widget) override;

protected:
    QGraphicsSimpleTextItem *_textItem;
    QString _text;
    QPointF _pos;
};

#endif // PLAYERBUBBLEITEM_H
