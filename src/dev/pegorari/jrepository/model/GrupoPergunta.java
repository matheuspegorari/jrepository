package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GrupoPergunta implements SankhyaEntity<GrupoPergunta> {

   private String analitico;
   private String ativo;
   private BigDecimal codGrupoPerg;
   private BigDecimal codGrupoPergPai;
   private BigDecimal codUsu;
   private String descrGrupoPerg;
   private Timestamp dhAlter;
   private BigDecimal grau;

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodGrupoPerg() {
        return codGrupoPerg;
   }

   public void setCodGrupoPerg(BigDecimal codGrupoPerg) {
        this.codGrupoPerg = codGrupoPerg;
   }

   public BigDecimal getCodGrupoPergPai() {
        return codGrupoPergPai;
   }

   public void setCodGrupoPergPai(BigDecimal codGrupoPergPai) {
        this.codGrupoPergPai = codGrupoPergPai;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescrGrupoPerg() {
        return descrGrupoPerg;
   }

   public void setDescrGrupoPerg(String descrGrupoPerg) {
        this.descrGrupoPerg = descrGrupoPerg;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        this.grau = grau;
   }

   @Override
   public String getEntityName() {
        return "GrupoPergunta";
   }

   @Override
   public GrupoPergunta fromVO(DynamicVO vo) {
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.codGrupoPerg = vo.asBigDecimal("CODGRUPOPERG");
        this.codGrupoPergPai = vo.asBigDecimal("CODGRUPOPERGPAI");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descrGrupoPerg = vo.asString("DESCRGRUPOPERG");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.grau = vo.asBigDecimal("GRAU");
        return this;
   }
}
