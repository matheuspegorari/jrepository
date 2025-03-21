package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Questionario extends AbstractSankhyaEntity<Questionario> {
   private String perguntasPorGrupo;
   private Timestamp dhAlter;
   private String exiberespCorreta;
   private BigDecimal nroPergPorPag;
   private String ordemAleatoria;
   private String ativo;
   private BigDecimal codGrupoQuest;
   private BigDecimal codQuest;
   private BigDecimal codUsu;
   private String descrQuest;

   public String getPerguntasPorGrupo() {
        return perguntasPorGrupo;
   }

   public void setPerguntasPorGrupo(String perguntasPorGrupo) {
        markAsChanged("PERGUNTASPORGRUPO", perguntasPorGrupo);
        this.perguntasPorGrupo = perguntasPorGrupo;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getExiberespCorreta() {
        return exiberespCorreta;
   }

   public void setExiberespCorreta(String exiberespCorreta) {
        markAsChanged("EXIBERESPCORRETA", exiberespCorreta);
        this.exiberespCorreta = exiberespCorreta;
   }

   public BigDecimal getNroPergPorPag() {
        return nroPergPorPag;
   }

   public void setNroPergPorPag(BigDecimal nroPergPorPag) {
        markAsChanged("NROPERGPORPAG", nroPergPorPag);
        this.nroPergPorPag = nroPergPorPag;
   }

   public String getOrdemAleatoria() {
        return ordemAleatoria;
   }

   public void setOrdemAleatoria(String ordemAleatoria) {
        markAsChanged("ORDEMALEATORIA", ordemAleatoria);
        this.ordemAleatoria = ordemAleatoria;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodGrupoQuest() {
        return codGrupoQuest;
   }

   public void setCodGrupoQuest(BigDecimal codGrupoQuest) {
        markAsChanged("CODGRUPOQUEST", codGrupoQuest);
        this.codGrupoQuest = codGrupoQuest;
   }

   public BigDecimal getCodQuest() {
        return codQuest;
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
        this.codQuest = codQuest;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getDescrQuest() {
        return descrQuest;
   }

   public void setDescrQuest(String descrQuest) {
        markAsChanged("DESCRQUEST", descrQuest);
        this.descrQuest = descrQuest;
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
        this.setOriginalVO(vo);
        this.perguntasPorGrupo = vo.asString("PERGUNTASPORGRUPO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.exiberespCorreta = vo.asString("EXIBERESPCORRETA");
        this.nroPergPorPag = vo.asBigDecimal("NROPERGPORPAG");
        this.ordemAleatoria = vo.asString("ORDEMALEATORIA");
        this.ativo = vo.asString("ATIVO");
        this.codGrupoQuest = vo.asBigDecimal("CODGRUPOQUEST");
        this.codQuest = vo.asBigDecimal("CODQUEST");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descrQuest = vo.asString("DESCRQUEST");
        return this;
   }
}
