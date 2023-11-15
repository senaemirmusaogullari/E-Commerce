package com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductEntity;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductEntity> __insertionAdapterOfProductEntity;

  private final EntityDeletionOrUpdateAdapter<ProductEntity> __deletionAdapterOfProductEntity;

  public ProductDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductEntity = new EntityInsertionAdapter<ProductEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `products` (`id`,`title`,`price`,`salePrice`,`description`,`category`,`imageOne`,`imageTwo`,`imageThree`,`rate`,`count`,`saleState`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final ProductEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getPrice() == null) {
          statement.bindNull(3);
        } else {
          statement.bindDouble(3, entity.getPrice());
        }
        if (entity.getSalePrice() == null) {
          statement.bindNull(4);
        } else {
          statement.bindDouble(4, entity.getSalePrice());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getDescription());
        }
        if (entity.getCategory() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getCategory());
        }
        if (entity.getImageOne() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getImageOne());
        }
        if (entity.getImageTwo() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getImageTwo());
        }
        if (entity.getImageThree() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getImageThree());
        }
        if (entity.getRate() == null) {
          statement.bindNull(10);
        } else {
          statement.bindDouble(10, entity.getRate());
        }
        if (entity.getCount() == null) {
          statement.bindNull(11);
        } else {
          statement.bindLong(11, entity.getCount());
        }
        final Integer _tmp = entity.getSaleState() == null ? null : (entity.getSaleState() ? 1 : 0);
        if (_tmp == null) {
          statement.bindNull(12);
        } else {
          statement.bindLong(12, _tmp);
        }
      }
    };
    this.__deletionAdapterOfProductEntity = new EntityDeletionOrUpdateAdapter<ProductEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `products` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final ProductEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
      }
    };
  }

  @Override
  public Object addProduct(final ProductEntity productEntity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductEntity.insert(productEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteProduct(final ProductEntity productEntity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProductEntity.handle(productEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getProducts(final Continuation<? super List<ProductEntity>> $completion) {
    final String _sql = "SELECT * FROM products";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ProductEntity>>() {
      @Override
      @NonNull
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfSalePrice = CursorUtil.getColumnIndexOrThrow(_cursor, "salePrice");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfImageOne = CursorUtil.getColumnIndexOrThrow(_cursor, "imageOne");
          final int _cursorIndexOfImageTwo = CursorUtil.getColumnIndexOrThrow(_cursor, "imageTwo");
          final int _cursorIndexOfImageThree = CursorUtil.getColumnIndexOrThrow(_cursor, "imageThree");
          final int _cursorIndexOfRate = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
          final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
          final int _cursorIndexOfSaleState = CursorUtil.getColumnIndexOrThrow(_cursor, "saleState");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ProductEntity _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Double _tmpPrice;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmpPrice = null;
            } else {
              _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            }
            final Double _tmpSalePrice;
            if (_cursor.isNull(_cursorIndexOfSalePrice)) {
              _tmpSalePrice = null;
            } else {
              _tmpSalePrice = _cursor.getDouble(_cursorIndexOfSalePrice);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpImageOne;
            if (_cursor.isNull(_cursorIndexOfImageOne)) {
              _tmpImageOne = null;
            } else {
              _tmpImageOne = _cursor.getString(_cursorIndexOfImageOne);
            }
            final String _tmpImageTwo;
            if (_cursor.isNull(_cursorIndexOfImageTwo)) {
              _tmpImageTwo = null;
            } else {
              _tmpImageTwo = _cursor.getString(_cursorIndexOfImageTwo);
            }
            final String _tmpImageThree;
            if (_cursor.isNull(_cursorIndexOfImageThree)) {
              _tmpImageThree = null;
            } else {
              _tmpImageThree = _cursor.getString(_cursorIndexOfImageThree);
            }
            final Double _tmpRate;
            if (_cursor.isNull(_cursorIndexOfRate)) {
              _tmpRate = null;
            } else {
              _tmpRate = _cursor.getDouble(_cursorIndexOfRate);
            }
            final Integer _tmpCount;
            if (_cursor.isNull(_cursorIndexOfCount)) {
              _tmpCount = null;
            } else {
              _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            }
            final Boolean _tmpSaleState;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfSaleState)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfSaleState);
            }
            _tmpSaleState = _tmp == null ? null : _tmp != 0;
            _item = new ProductEntity(_tmpId,_tmpTitle,_tmpPrice,_tmpSalePrice,_tmpDescription,_tmpCategory,_tmpImageOne,_tmpImageTwo,_tmpImageThree,_tmpRate,_tmpCount,_tmpSaleState);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getProductIds(final Continuation<? super List<Integer>> $completion) {
    final String _sql = "SELECT id FROM products";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Integer>>() {
      @Override
      @NonNull
      public List<Integer> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<Integer> _result = new ArrayList<Integer>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Integer _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getInt(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
