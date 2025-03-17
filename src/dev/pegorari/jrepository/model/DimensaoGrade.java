package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class DimensaoGrade implements SankhyaEntity<DimensaoGrade> {

   private String abvAtb;
   private BigDecimal idAtb;
   private BigDecimal idGrade;
   private String nomeAtb;
   private BigDecimal ordCamp;
   private String tipo;
   private String atuniversao;
   private BigDecimal nuVersao;

   public String getAbvAtb() {
        return abvAtb;
   }

   public void setAbvAtb(String abvAtb) {
        this.abvAtb = abvAtb;
   }

   public BigDecimal getIdAtb() {
        return idAtb;
   }

   public void setIdAtb(BigDecimal idAtb) {
        this.idAtb = idAtb;
   }

   public BigDecimal getIdGrade() {
        return idGrade;
   }

   public void setIdGrade(BigDecimal idGrade) {
        this.idGrade = idGrade;
   }

   public String getNomeAtb() {
        return nomeAtb;
   }

   public void setNomeAtb(String nomeAtb) {
        this.nomeAtb = nomeAtb;
   }

   public BigDecimal getOrdCamp() {
        return ordCamp;
   }

   public void setOrdCamp(BigDecimal ordCamp) {
        this.ordCamp = ordCamp;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getAtuniversao() {
        return atuniversao;
   }

   public void setAtuniversao(String atuniversao) {
        this.atuniversao = atuniversao;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        this.nuVersao = nuVersao;
   }

   @Override
   public String getEntityName() {
        return "DimensaoGrade";
   }

   @Override
   public DimensaoGrade fromVO(DynamicVO vo) {
        this.abvAtb = vo.asString("ABVATB");
        this.idAtb = vo.asBigDecimal("IDATB");
        this.idGrade = vo.asBigDecimal("IDGRADE");
        this.nomeAtb = vo.asString("NOMEATB");
        this.ordCamp = vo.asBigDecimal("ORDCAMP");
        this.tipo = vo.asString("TIPO");
        this.atuniversao = vo.asString("ATUNIVERSAO");
        this.nuVersao = vo.asBigDecimal("NUVERSAO");
        return this;
   }
}
