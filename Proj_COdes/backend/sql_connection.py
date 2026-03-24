import datetime
import mysql.connector


def get_sql_connection():
  """Return a fresh MySQL connection."""
  print("Opening mysql connection")
  return mysql.connector.connect(
      user='root',
      password='abc0841',
      database='grocery_store',
      autocommit=True
  )