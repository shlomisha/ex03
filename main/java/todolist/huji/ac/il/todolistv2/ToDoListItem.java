package todolist.huji.ac.il.todolistv2;

import java.util.Calendar;
import java.util.Date;

public class ToDoListItem {

	private static int _lastID = 0;

	private int _id;
	private String _name;
	private Date _dueDate;

	public ToDoListItem(String name, Date dueDate) {
		_lastID++;

		this._id = _lastID;
		this._name = name;
		this._dueDate = removeTime((Date) dueDate.clone());
	}

	public int getID() {
		return (this._id);
	}

	public String getName() {
		return (this._name);
	}

	public Date getDueDate() {
		return ((Date) this._dueDate.clone());
	}

	public static Date removeTime(Date date) {
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		return (calendar.getTime());
	}

}