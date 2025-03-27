package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DbExplorerQuery extends AbstractSankhyaEntity<DbExplorerQuery> {
   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public char[] getTextoQuery() {
        return this.getVo().asClob("TEXTOQUERY");
   }

   public void setTextoQuery(char[] textoQuery) {
        markAsChanged("TEXTOQUERY", textoQuery);
   }

   public String getTituloQuery() {
        return this.getVo().asString("TITULOQUERY");
   }

   public void setTituloQuery(String tituloQuery) {
        markAsChanged("TITULOQUERY", tituloQuery);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuQuery() {
        return this.getVo().asBigDecimal("NUQUERY");
   }

   public void setNuQuery(BigDecimal nuQuery) {
        markAsChanged("NUQUERY", nuQuery);
   }

   @Override
   public String getTableName() {
        return "TSIDBQUERY";
   }

   @Override
   public String getEntityName() {
        return "DbExplorerQuery";
   }

   @Override
   public DbExplorerQuery fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
