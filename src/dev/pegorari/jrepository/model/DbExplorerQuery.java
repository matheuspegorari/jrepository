package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DbExplorerQuery extends AbstractSankhyaEntity<DbExplorerQuery> {
   private Timestamp dhAlter;
   private char[] textoQuery;
   private String tituloQuery;
   private BigDecimal codUsu;
   private BigDecimal nuQuery;

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public char[] getTextoQuery() {
        return textoQuery;
   }

   public void setTextoQuery(char[] textoQuery) {
        markAsChanged("TEXTOQUERY", textoQuery);
        this.textoQuery = textoQuery;
   }

   public String getTituloQuery() {
        return tituloQuery;
   }

   public void setTituloQuery(String tituloQuery) {
        markAsChanged("TITULOQUERY", tituloQuery);
        this.tituloQuery = tituloQuery;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getNuQuery() {
        return nuQuery;
   }

   public void setNuQuery(BigDecimal nuQuery) {
        markAsChanged("NUQUERY", nuQuery);
        this.nuQuery = nuQuery;
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
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.textoQuery = vo.asClob("TEXTOQUERY");
        this.tituloQuery = vo.asString("TITULOQUERY");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuQuery = vo.asBigDecimal("NUQUERY");
        return this;
   }
}
