package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoAdmJudicial extends AbstractSankhyaEntity<ProcessoAdmJudicial> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getAutoria() {
        return this.getVo().asString("AUTORIA");
   }

   public void setAutoria(String autoria) {
        markAsChanged("AUTORIA", autoria);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public String getCodIdentVara() {
        return this.getVo().asString("CODIDENTVARA");
   }

   public void setCodIdentVara(String codIdentVara) {
        markAsChanged("CODIDENTVARA", codIdentVara);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtFimValidade() {
        return this.getVo().asTimestamp("DTFIMVALIDADE");
   }

   public void setDtFimValidade(Timestamp dtFimValidade) {
        markAsChanged("DTFIMVALIDADE", dtFimValidade);
   }

   public Timestamp getDtIniValidade() {
        return this.getVo().asTimestamp("DTINIVALIDADE");
   }

   public void setDtIniValidade(Timestamp dtIniValidade) {
        markAsChanged("DTINIVALIDADE", dtIniValidade);
   }

   public BigDecimal getIndOrigProc() {
        return this.getVo().asBigDecimal("INDORIGPROC");
   }

   public void setIndOrigProc(BigDecimal indOrigProc) {
        markAsChanged("INDORIGPROC", indOrigProc);
   }

   public String getNumProcesso() {
        return this.getVo().asString("NUMPROCESSO");
   }

   public void setNumProcesso(String numProcesso) {
        markAsChanged("NUMPROCESSO", numProcesso);
   }

   public BigDecimal getNuProcesso() {
        return this.getVo().asBigDecimal("NUPROCESSO");
   }

   public void setNuProcesso(BigDecimal nuProcesso) {
        markAsChanged("NUPROCESSO", nuProcesso);
   }

   public BigDecimal getTipo() {
        return this.getVo().asBigDecimal("TIPO");
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getDescrComplReg1011() {
        return this.getVo().asString("DESCRCOMPLREG1011");
   }

   public void setDescrComplReg1011(String descrComplReg1011) {
        markAsChanged("DESCRCOMPLREG1011", descrComplReg1011);
   }

   public BigDecimal getTipAtoConces() {
        return this.getVo().asBigDecimal("TIPATOCONCES");
   }

   public void setTipAtoConces(BigDecimal tipAtoConces) {
        markAsChanged("TIPATOCONCES", tipAtoConces);
   }

   public String getGerTagProXmlNfe() {
        return this.getVo().asString("GERTAGPROXMLNFE");
   }

   public void setGerTagProXmlNfe(String gerTagProXmlNfe) {
        markAsChanged("GERTAGPROXMLNFE", gerTagProXmlNfe);
   }

   public BigDecimal getOrigemProcesso() {
        return this.getVo().asBigDecimal("ORIGEMPROCESSO");
   }

   public void setOrigemProcesso(BigDecimal origemProcesso) {
        markAsChanged("ORIGEMPROCESSO", origemProcesso);
   }

   @Override
   public String getTableName() {
        return "TRIPAJ";
   }

   @Override
   public String getEntityName() {
        return "ProcessoAdmJudicial";
   }

   @Override
   public ProcessoAdmJudicial fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
