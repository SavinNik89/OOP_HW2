package Home_Work_5;

import Home_Work_5.models.TableModel;
import Home_Work_5.presenters.BookingPresenter;
import Home_Work_5.presenters.Model;
import Home_Work_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: Домашняя работа: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     * @param args
     */
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable()
        bookingView.reservationTable(new Date(), 1103, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");

        bookingView.changeReservationTable(9001, new Date(), 101, "Станислав");
        bookingView.changeReservationTable(9001, new Date(), 104, "Станислав");
    }

}
