package ch.hilbri.assist.mapping.importers.excel;

import ch.hilbri.assist.mapping.importers.excel.data.Application;
import ch.hilbri.assist.mapping.importers.excel.data.Board;
import ch.hilbri.assist.mapping.importers.excel.data.IOAdapter;
import com.google.common.base.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ExcelInputTransformator {
  public static String clear(final String excelRawData) {
    String _replaceAll = excelRawData.replaceAll("[[^a-z]&&[^A-Z]&&[^0-9]]", "_");
    String _replaceAll_1 = _replaceAll.replaceAll("^_*", "");
    String _replaceAll_2 = _replaceAll_1.replaceAll("_*$", "");
    String _replaceAll_3 = _replaceAll_2.replaceAll("^[0-9]*", "");
    return _replaceAll_3.replaceAll("__+", "_");
  }
  
  public static String createMDSLFileInput(final String filePath) {
    String _createHeader = ExcelInputTransformator.createHeader(filePath);
    String _createBoardsAndIOAdapters = ExcelInputTransformator.createBoardsAndIOAdapters(filePath);
    String _plus = (_createHeader + _createBoardsAndIOAdapters);
    String _createApplicationsAndGroups = ExcelInputTransformator.createApplicationsAndGroups(filePath);
    return (_plus + _createApplicationsAndGroups);
  }
  
  public static String createHeader(final String filePath) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated from Excel file ");
    _builder.append(filePath, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("Global {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System name = \"Generated System\";");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String createBoardsAndIOAdapters(final String filePath) {
    try {
      File inputWorkbook = new File(filePath);
      Workbook workbook = null;
      final ArrayList<Board> allBoards = new ArrayList<Board>();
      try {
        Workbook _workbook = Workbook.getWorkbook(inputWorkbook);
        workbook = _workbook;
        Sheet sheet = workbook.getSheet("Hardware");
        String excelResName = null;
        int _rows = sheet.getRows();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _rows, true);
        for (final Integer row : _doubleDotLessThan) {
          {
            boolean isNewBoard = false;
            Cell _cell = sheet.getCell(0, (row).intValue());
            String _contents = _cell.getContents();
            int _length = _contents.length();
            boolean _greaterThan = (_length > 0);
            if (_greaterThan) {
              Cell _cell_1 = sheet.getCell(0, (row).intValue());
              String _contents_1 = _cell_1.getContents();
              String _clear = ExcelInputTransformator.clear(_contents_1);
              excelResName = _clear;
              isNewBoard = true;
            }
            Cell _cell_2 = sheet.getCell(1, (row).intValue());
            String _contents_2 = _cell_2.getContents();
            final String excelType = ExcelInputTransformator.clear(_contents_2);
            Cell _cell_3 = sheet.getCell(2, (row).intValue());
            String _contents_3 = _cell_3.getContents();
            final String excelResPosX = ExcelInputTransformator.clear(_contents_3);
            Cell _cell_4 = sheet.getCell(3, (row).intValue());
            String _contents_4 = _cell_4.getContents();
            final String excelResPosY = ExcelInputTransformator.clear(_contents_4);
            Cell _cell_5 = sheet.getCell(4, (row).intValue());
            String _contents_5 = _cell_5.getContents();
            final String excelResWeight = ExcelInputTransformator.clear(_contents_5);
            Cell _cell_6 = sheet.getCell(5, (row).intValue());
            String _contents_6 = _cell_6.getContents();
            final String excelPowerSupply = ExcelInputTransformator.clear(_contents_6);
            Cell _cell_7 = sheet.getCell(6, (row).intValue());
            String _contents_7 = _cell_7.getContents();
            final String excelSide = ExcelInputTransformator.clear(_contents_7);
            Cell _cell_8 = sheet.getCell(7, (row).intValue());
            String _contents_8 = _cell_8.getContents();
            final String excelEss = ExcelInputTransformator.clear(_contents_8);
            Cell _cell_9 = sheet.getCell(8, (row).intValue());
            String _contents_9 = _cell_9.getContents();
            final String excelResProtLvl = ExcelInputTransformator.clear(_contents_9);
            final HashMap<String, String> excelCustomType = new HashMap<String, String>();
            IntegerRange _upTo = new IntegerRange(1, 39);
            for (final Integer i : _upTo) {
              {
                Cell _cell_10 = sheet.getCell((8 + (i).intValue()), (row).intValue());
                final String excelCustomEntry = _cell_10.getContents();
                int _length_1 = excelCustomEntry.length();
                boolean _greaterThan_1 = (_length_1 > 0);
                if (_greaterThan_1) {
                  int _parseInt = Integer.parseInt(excelCustomEntry);
                  boolean _greaterThan_2 = (_parseInt > 0);
                  if (_greaterThan_2) {
                    excelCustomType.put(("CustomType" + i), excelCustomEntry);
                  }
                }
              }
            }
            Board currentBoard = null;
            if (isNewBoard) {
              Board _board = new Board(excelResName, excelType, excelPowerSupply, excelSide, excelEss);
              currentBoard = _board;
              int _length_1 = excelResPosX.length();
              boolean _greaterThan_1 = (_length_1 > 0);
              if (_greaterThan_1) {
                Map<String, String> _genericParameters = currentBoard.getGenericParameters();
                _genericParameters.put("RES_POSITION_X", excelResPosX);
              }
              int _length_2 = excelResPosY.length();
              boolean _greaterThan_2 = (_length_2 > 0);
              if (_greaterThan_2) {
                Map<String, String> _genericParameters_1 = currentBoard.getGenericParameters();
                _genericParameters_1.put("RES_POSITION_Y", excelResPosY);
              }
              int _length_3 = excelResWeight.length();
              boolean _greaterThan_3 = (_length_3 > 0);
              if (_greaterThan_3) {
                Map<String, String> _genericParameters_2 = currentBoard.getGenericParameters();
                _genericParameters_2.put("RES_WEIGHT", excelResWeight);
              }
              allBoards.add(currentBoard);
            } else {
              for (final Board otherBoard : allBoards) {
                String _name = otherBoard.getName();
                boolean _equals = _name.equals(excelResName);
                if (_equals) {
                  currentBoard = otherBoard;
                }
              }
            }
            Set<String> _keySet = excelCustomType.keySet();
            List<String> _sort = IterableExtensions.<String>sort(_keySet);
            for (final String adapterType : _sort) {
              ArrayList<IOAdapter> _ioAdapters = currentBoard.getIoAdapters();
              String _get = excelCustomType.get(adapterType);
              IOAdapter _iOAdapter = new IOAdapter(adapterType, excelResProtLvl, _get);
              _ioAdapters.add(_iOAdapter);
            }
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof BiffException) {
          final BiffException e = (BiffException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hardware {");
      _builder.newLine();
      {
        final Function1<Board, String> _function = new Function1<Board, String>() {
          public String apply(final Board it) {
            return it.getName();
          }
        };
        List<Board> _sortBy = IterableExtensions.<Board, String>sortBy(allBoards, _function);
        for(final Board board : _sortBy) {
          _builder.append("\t");
          _builder.append("Board ");
          String _name = board.getName();
          _builder.append(_name, "\t");
          _builder.append(" {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            String _type = board.getType();
            int _length = _type.length();
            boolean _greaterThan = (_length > 0);
            if (_greaterThan) {
              _builder.append("Type = \"");
              String _type_1 = board.getType();
              _builder.append(_type_1, "\t\t");
              _builder.append("\";");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            String _powersupply = board.getPowersupply();
            int _length_1 = _powersupply.length();
            boolean _greaterThan_1 = (_length_1 > 0);
            if (_greaterThan_1) {
              _builder.append("PowerSupply = \"");
              String _powersupply_1 = board.getPowersupply();
              _builder.append(_powersupply_1, "\t\t");
              _builder.append("\";");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            String _side = board.getSide();
            int _length_2 = _side.length();
            boolean _greaterThan_2 = (_length_2 > 0);
            if (_greaterThan_2) {
              _builder.append("Side = \"");
              String _side_1 = board.getSide();
              _builder.append(_side_1, "\t\t");
              _builder.append("\";");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            String _ess = board.getEss();
            int _length_3 = _ess.length();
            boolean _greaterThan_3 = (_length_3 > 0);
            if (_greaterThan_3) {
              _builder.append("ESS = \"");
              String _ess_1 = board.getEss();
              _builder.append(_ess_1, "\t\t");
              _builder.append("\";");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("Processor Processor0 { Core Core0 {}}");
          _builder.newLine();
          {
            ArrayList<IOAdapter> _ioAdapters = board.getIoAdapters();
            final Function1<IOAdapter, String> _function_1 = new Function1<IOAdapter, String>() {
              public String apply(final IOAdapter it) {
                return it.getType();
              }
            };
            List<IOAdapter> _sortBy_1 = IterableExtensions.<IOAdapter, String>sortBy(_ioAdapters, _function_1);
            for(final IOAdapter adapt : _sortBy_1) {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("I/O adapter {");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("type  = ");
              String _type_2 = adapt.getType();
              _builder.append(_type_2, "\t\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("count = ");
              String _units = adapt.getUnits();
              _builder.append(_units, "\t\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("protection-level = ");
              String _ioProtectionLevel = adapt.getIoProtectionLevel();
              _builder.append(_ioProtectionLevel, "\t\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("Generic properties { ");
          _builder.newLine();
          {
            Map<String, String> _genericParameters = board.getGenericParameters();
            Set<String> _keySet = _genericParameters.keySet();
            for(final String p : _keySet) {
              _builder.append("\t");
              _builder.append("\t\t");
              _builder.append("\"");
              _builder.append(p, "\t\t\t");
              _builder.append("\" = ");
              Map<String, String> _genericParameters_1 = board.getGenericParameters();
              String _get = _genericParameters_1.get(p);
              _builder.append(_get, "\t\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      return _builder.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String createApplicationsAndGroups(final String filePath) {
    try {
      File inputWorkbook = new File(filePath);
      Workbook workbook = null;
      final ArrayList<Application> allApplications = new ArrayList<Application>();
      final HashMap<String, ArrayList<Application>> allApplicationGroups = new HashMap<String, ArrayList<Application>>();
      try {
        Workbook _workbook = Workbook.getWorkbook(inputWorkbook);
        workbook = _workbook;
        Sheet sheet = workbook.getSheet("Software");
        int _rows = sheet.getRows();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _rows, true);
        for (final Integer row : _doubleDotLessThan) {
          {
            Cell _cell = sheet.getCell(0, (row).intValue());
            String _contents = _cell.getContents();
            final String systemName = ExcelInputTransformator.clear(_contents);
            Cell _cell_1 = sheet.getCell(1, (row).intValue());
            String _contents_1 = _cell_1.getContents();
            final String subSystemName = ExcelInputTransformator.clear(_contents_1);
            Cell _cell_2 = sheet.getCell(11, (row).intValue());
            String _contents_2 = _cell_2.getContents();
            final String equipmentName = ExcelInputTransformator.clear(_contents_2);
            Cell _cell_3 = sheet.getCell(8, (row).intValue());
            String _contents_3 = _cell_3.getContents();
            final String interfaceUnit = ExcelInputTransformator.clear(_contents_3);
            Cell _cell_4 = sheet.getCell(7, (row).intValue());
            String _contents_4 = _cell_4.getContents();
            final String interfaceType = ExcelInputTransformator.clear(_contents_4);
            Cell _cell_5 = sheet.getCell(9, (row).intValue());
            String _contents_5 = _cell_5.getContents();
            final String paramWeight = ExcelInputTransformator.clear(_contents_5);
            Cell _cell_6 = sheet.getCell(10, (row).intValue());
            String _contents_6 = _cell_6.getContents();
            final String paramEqPower = ExcelInputTransformator.clear(_contents_6);
            Cell _cell_7 = sheet.getCell(13, (row).intValue());
            String _contents_7 = _cell_7.getContents();
            final String paramEqPosX = ExcelInputTransformator.clear(_contents_7);
            Cell _cell_8 = sheet.getCell(14, (row).intValue());
            String _contents_8 = _cell_8.getContents();
            final String paramEqPosY = ExcelInputTransformator.clear(_contents_8);
            Cell _cell_9 = sheet.getCell(15, (row).intValue());
            String _contents_9 = _cell_9.getContents();
            final String paramProtectionLvl = ExcelInputTransformator.clear(_contents_9);
            int _length = systemName.length();
            boolean _greaterThan = (_length > 0);
            if (_greaterThan) {
              final String applicationName = ((subSystemName + "__") + equipmentName);
              final String applicationProtectionLevel = paramProtectionLvl;
              final String ioAdapterType = interfaceType;
              int ioAdapterCount = 0;
              int _length_1 = interfaceUnit.length();
              boolean _greaterThan_1 = (_length_1 > 0);
              if (_greaterThan_1) {
                int _parseInt = Integer.parseInt(interfaceUnit);
                ioAdapterCount = _parseInt;
              } else {
                ioAdapterCount = 1;
              }
              Application application = null;
              for (final Application app : allApplications) {
                String _name = app.getName();
                boolean _equals = _name.equals(applicationName);
                if (_equals) {
                  application = app;
                }
              }
              boolean _equals_1 = Objects.equal(application, null);
              if (_equals_1) {
                Application _application = new Application(applicationName, applicationProtectionLevel);
                application = _application;
                allApplications.add(application);
              }
              Map<String, Integer> _ioAdapterRequirements = application.getIoAdapterRequirements();
              boolean _containsKey = _ioAdapterRequirements.containsKey(ioAdapterType);
              if (_containsKey) {
                Map<String, Integer> _ioAdapterRequirements_1 = application.getIoAdapterRequirements();
                Map<String, Integer> _ioAdapterRequirements_2 = application.getIoAdapterRequirements();
                Integer _get = _ioAdapterRequirements_2.get(ioAdapterType);
                int _plus = ((_get).intValue() + ioAdapterCount);
                _ioAdapterRequirements_1.put(ioAdapterType, Integer.valueOf(_plus));
              } else {
                Map<String, Integer> _ioAdapterRequirements_3 = application.getIoAdapterRequirements();
                _ioAdapterRequirements_3.put(ioAdapterType, Integer.valueOf(ioAdapterCount));
              }
              int _length_2 = paramWeight.length();
              boolean _greaterThan_2 = (_length_2 > 0);
              if (_greaterThan_2) {
                Map<String, String> _genericParameters = application.getGenericParameters();
                _genericParameters.put("CABLE_WEIGHT", paramWeight);
              }
              int _length_3 = paramEqPosX.length();
              boolean _greaterThan_3 = (_length_3 > 0);
              if (_greaterThan_3) {
                Map<String, String> _genericParameters_1 = application.getGenericParameters();
                _genericParameters_1.put("EQ_POSITION_X", paramEqPosX);
              }
              int _length_4 = paramEqPosY.length();
              boolean _greaterThan_4 = (_length_4 > 0);
              if (_greaterThan_4) {
                Map<String, String> _genericParameters_2 = application.getGenericParameters();
                _genericParameters_2.put("EQ_POSITION_Y", paramEqPosY);
              }
              int _length_5 = paramEqPower.length();
              boolean _greaterThan_5 = (_length_5 > 0);
              if (_greaterThan_5) {
                Map<String, String> _genericParameters_3 = application.getGenericParameters();
                _genericParameters_3.put("EQ_POWER", paramEqPower);
              }
              final String genParmProtectionLevel = paramProtectionLvl.substring(1);
              int _length_6 = paramProtectionLvl.length();
              boolean _greaterThan_6 = (_length_6 > 0);
              if (_greaterThan_6) {
                Map<String, String> _genericParameters_4 = application.getGenericParameters();
                _genericParameters_4.put("EQ_PROTECTION_LEVEL", genParmProtectionLevel);
              }
              boolean _containsKey_1 = allApplicationGroups.containsKey(subSystemName);
              boolean _not = (!_containsKey_1);
              if (_not) {
                ArrayList<Application> _arrayList = new ArrayList<Application>();
                allApplicationGroups.put(subSystemName, _arrayList);
              }
              ArrayList<Application> _get_1 = allApplicationGroups.get(subSystemName);
              boolean _contains = _get_1.contains(application);
              boolean _not_1 = (!_contains);
              if (_not_1) {
                ArrayList<Application> _get_2 = allApplicationGroups.get(subSystemName);
                _get_2.add(application);
              }
            }
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof BiffException) {
          final BiffException e = (BiffException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Software {");
      _builder.newLine();
      {
        for(final Application application : allApplications) {
          _builder.append("\t");
          _builder.append("Application ");
          String _name = application.getName();
          _builder.append(_name, "\t");
          _builder.append(" {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            String _protectionLevel = application.getProtectionLevel();
            int _length = _protectionLevel.length();
            boolean _greaterThan = (_length > 0);
            if (_greaterThan) {
              _builder.append("Required IO protection = ");
              String _protectionLevel_1 = application.getProtectionLevel();
              _builder.append(_protectionLevel_1, "\t\t");
              _builder.append(";");
            }
          }
          _builder.newLineIfNotEmpty();
          {
            Map<String, Integer> _ioAdapterRequirements = application.getIoAdapterRequirements();
            Set<String> _keySet = _ioAdapterRequirements.keySet();
            for(final String ioReq : _keySet) {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("Requires ");
              Map<String, Integer> _ioAdapterRequirements_1 = application.getIoAdapterRequirements();
              Integer _get = _ioAdapterRequirements_1.get(ioReq);
              _builder.append(_get, "\t\t");
              _builder.append(" ");
              _builder.append(ioReq, "\t\t");
              _builder.append(" adapter exclusive;");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("Generic properties { ");
          _builder.newLine();
          {
            Map<String, String> _genericParameters = application.getGenericParameters();
            Set<String> _keySet_1 = _genericParameters.keySet();
            for(final String p : _keySet_1) {
              _builder.append("\t");
              _builder.append("\t\t");
              _builder.append("\"");
              _builder.append(p, "\t\t\t");
              _builder.append("\" = ");
              Map<String, String> _genericParameters_1 = application.getGenericParameters();
              String _get_1 = _genericParameters_1.get(p);
              _builder.append(_get_1, "\t\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
        }
      }
      {
        Set<String> _keySet_2 = allApplicationGroups.keySet();
        final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
          public Boolean apply(final String it) {
            ArrayList<Application> _get = allApplicationGroups.get(it);
            int _size = _get.size();
            return Boolean.valueOf((_size > 1));
          }
        };
        Iterable<String> _filter = IterableExtensions.<String>filter(_keySet_2, _function);
        for(final String groupName : _filter) {
          _builder.append("\t");
          _builder.append("Group Group_");
          _builder.append(groupName, "\t");
          _builder.append(" { ");
          {
            ArrayList<Application> _get_2 = allApplicationGroups.get(groupName);
            for(final Application app : _get_2) {
              {
                ArrayList<Application> _get_3 = allApplicationGroups.get(groupName);
                int _indexOf = _get_3.indexOf(app);
                boolean _greaterThan_1 = (_indexOf > 0);
                if (_greaterThan_1) {
                  _builder.append(", ");
                }
              }
              String _name_1 = app.getName();
              _builder.append(_name_1, "\t");
            }
          }
          _builder.append(" }");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      return _builder.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
