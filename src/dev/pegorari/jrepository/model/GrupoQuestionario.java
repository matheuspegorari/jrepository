package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GrupoQuestionario implements SankhyaEntity<GrupoQuestionario> {

   private String analitico;
   private String ativo;
   private BigDecimal codGrupoQuest;
   private BigDecimal codGrupoQuestPai;
   private BigDecimal codUsu;
   private String descrGrupoQuest;
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

   public BigDecimal getCodGrupoQuest() {
        return codGrupoQuest;
   }

   public void setCodGrupoQuest(BigDecimal codGrupoQuest) {
        this.codGrupoQuest = codGrupoQuest;
   }

   public BigDecimal getCodGrupoQuestPai() {
        return codGrupoQuestPai;
   }

   public void setCodGrupoQuestPai(BigDecimal codGrupoQuestPai) {
        this.codGrupoQuestPai = codGrupoQuestPai;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescrGrupoQuest() {
        return descrGrupoQuest;
   }

   public void setDescrGrupoQuest(String descrGrupoQuest) {
        this.descrGrupoQuest = descrGrupoQuest;
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
        return "GrupoQuestionario";
   }

   @Override
   public GrupoQuestionario fromVO(DynamicVO vo) {
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.codGrupoQuest = vo.asBigDecimal("CODGRUPOQUEST");
        this.codGrupoQuestPai = vo.asBigDecimal("CODGRUPOQUESTPAI");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descrGrupoQuest = vo.asString("DESCRGRUPOQUEST");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.grau = vo.asBigDecimal("GRAU");
        return this;
   }
}
