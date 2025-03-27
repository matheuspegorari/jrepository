package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Questionario extends AbstractSankhyaEntity<Questionario> {
   public String getPerguntasPorGrupo() {
        return this.getVo().asString("PERGUNTASPORGRUPO");
   }

   public void setPerguntasPorGrupo(String perguntasPorGrupo) {
        markAsChanged("PERGUNTASPORGRUPO", perguntasPorGrupo);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getExiberespCorreta() {
        return this.getVo().asString("EXIBERESPCORRETA");
   }

   public void setExiberespCorreta(String exiberespCorreta) {
        markAsChanged("EXIBERESPCORRETA", exiberespCorreta);
   }

   public BigDecimal getNroPergPorPag() {
        return this.getVo().asBigDecimal("NROPERGPORPAG");
   }

   public void setNroPergPorPag(BigDecimal nroPergPorPag) {
        markAsChanged("NROPERGPORPAG", nroPergPorPag);
   }

   public String getOrdemAleatoria() {
        return this.getVo().asString("ORDEMALEATORIA");
   }

   public void setOrdemAleatoria(String ordemAleatoria) {
        markAsChanged("ORDEMALEATORIA", ordemAleatoria);
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

   public BigDecimal getCodQuest() {
        return this.getVo().asBigDecimal("CODQUEST");
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescrQuest() {
        return this.getVo().asString("DESCRQUEST");
   }

   public void setDescrQuest(String descrQuest) {
        markAsChanged("DESCRQUEST", descrQuest);
   }

   @Override
   public String getTableName() {
        return "TPQQUE";
   }

   @Override
   public String getEntityName() {
        return "Questionario";
   }

   @Override
   public Questionario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
