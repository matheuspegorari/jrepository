package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoAdmJudicial implements SankhyaEntity<ProcessoAdmJudicial> {

   private String ativo;
   private String autoria;
   private BigDecimal codCid;
   private String codIdentVara;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private Timestamp dtFimValidade;
   private Timestamp dtIniValidade;
   private BigDecimal indOrigProc;
   private String numProcesso;
   private BigDecimal nuProcesso;
   private BigDecimal tipo;
   private String descrComplReg1011;
   private BigDecimal tipAtoConces;
   private String gerTagProXmlNfe;
   private BigDecimal origemProcesso;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public String getAutoria() {
        return autoria;
   }

   public void setAutoria(String autoria) {
        this.autoria = autoria;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        this.codCid = codCid;
   }

   public String getCodIdentVara() {
        return codIdentVara;
   }

   public void setCodIdentVara(String codIdentVara) {
        this.codIdentVara = codIdentVara;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtFimValidade() {
        return dtFimValidade;
   }

   public void setDtFimValidade(Timestamp dtFimValidade) {
        this.dtFimValidade = dtFimValidade;
   }

   public Timestamp getDtIniValidade() {
        return dtIniValidade;
   }

   public void setDtIniValidade(Timestamp dtIniValidade) {
        this.dtIniValidade = dtIniValidade;
   }

   public BigDecimal getIndOrigProc() {
        return indOrigProc;
   }

   public void setIndOrigProc(BigDecimal indOrigProc) {
        this.indOrigProc = indOrigProc;
   }

   public String getNumProcesso() {
        return numProcesso;
   }

   public void setNumProcesso(String numProcesso) {
        this.numProcesso = numProcesso;
   }

   public BigDecimal getNuProcesso() {
        return nuProcesso;
   }

   public void setNuProcesso(BigDecimal nuProcesso) {
        this.nuProcesso = nuProcesso;
   }

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        this.tipo = tipo;
   }

   public String getDescrComplReg1011() {
        return descrComplReg1011;
   }

   public void setDescrComplReg1011(String descrComplReg1011) {
        this.descrComplReg1011 = descrComplReg1011;
   }

   public BigDecimal getTipAtoConces() {
        return tipAtoConces;
   }

   public void setTipAtoConces(BigDecimal tipAtoConces) {
        this.tipAtoConces = tipAtoConces;
   }

   public String getGerTagProXmlNfe() {
        return gerTagProXmlNfe;
   }

   public void setGerTagProXmlNfe(String gerTagProXmlNfe) {
        this.gerTagProXmlNfe = gerTagProXmlNfe;
   }

   public BigDecimal getOrigemProcesso() {
        return origemProcesso;
   }

   public void setOrigemProcesso(BigDecimal origemProcesso) {
        this.origemProcesso = origemProcesso;
   }

   @Override
   public String getEntityName() {
        return "ProcessoAdmJudicial";
   }

   @Override
   public ProcessoAdmJudicial fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.autoria = vo.asString("AUTORIA");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codIdentVara = vo.asString("CODIDENTVARA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtFimValidade = vo.asTimestamp("DTFIMVALIDADE");
        this.dtIniValidade = vo.asTimestamp("DTINIVALIDADE");
        this.indOrigProc = vo.asBigDecimal("INDORIGPROC");
        this.numProcesso = vo.asString("NUMPROCESSO");
        this.nuProcesso = vo.asBigDecimal("NUPROCESSO");
        this.tipo = vo.asBigDecimal("TIPO");
        this.descrComplReg1011 = vo.asString("DESCRCOMPLREG1011");
        this.tipAtoConces = vo.asBigDecimal("TIPATOCONCES");
        this.gerTagProXmlNfe = vo.asString("GERTAGPROXMLNFE");
        this.origemProcesso = vo.asBigDecimal("ORIGEMPROCESSO");
        return this;
   }
}
