package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GrupoQuestionario extends AbstractSankhyaEntity<GrupoQuestionario> {
   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodGrupoQuest() {
        return this.getVo().asBigDecimal("CODGRUPOQUEST");
   }

   public void setCodGrupoQuest(BigDecimal codGrupoQuest) {
        markAsChanged("CODGRUPOQUEST", codGrupoQuest);
   }

   public BigDecimal getCodGrupoQuestPai() {
        return this.getVo().asBigDecimal("CODGRUPOQUESTPAI");
   }

   public void setCodGrupoQuestPai(BigDecimal codGrupoQuestPai) {
        markAsChanged("CODGRUPOQUESTPAI", codGrupoQuestPai);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescrGrupoQuest() {
        return this.getVo().asString("DESCRGRUPOQUEST");
   }

   public void setDescrGrupoQuest(String descrGrupoQuest) {
        markAsChanged("DESCRGRUPOQUEST", descrGrupoQuest);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   @Override
   public String getTableName() {
        return "TPQGRQ";
   }

   @Override
   public String getEntityName() {
        return "GrupoQuestionario";
   }

   @Override
   public GrupoQuestionario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
