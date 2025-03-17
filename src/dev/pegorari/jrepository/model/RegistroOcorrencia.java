package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroOcorrencia implements SankhyaEntity<RegistroOcorrencia> {

   private BigDecimal codFunc;
   private BigDecimal codHistOcor;
   private String descOcor;
   private Timestamp dtAlter;
   private Timestamp dtFinalOcor;
   private Timestamp dtInicOcor;
   private BigDecimal nuOcor;
   private String recorrente;
   private BigDecimal codEmp;
   private BigDecimal diasPrevRet;
   private Timestamp dtPrevRet;
   private BigDecimal codUsu;
   private BigDecimal nuReincid;
   private String digitado;
   private String indEfeitoRetro;
   private String forcaDtFim;
   private BigDecimal nuFalta;
   private BigDecimal nuManejo;
   private BigDecimal nuOcorOrig;
   private BigDecimal nuProcesso;
   private BigDecimal origRetif;
   private String reajusteCct;
   private String cid;
   private BigDecimal codSind;
   private Timestamp dtInterrompFer;
   private String envSocial;
   private String especialidade;
   private String processoCnv;
   private BigDecimal sequenciaCnv;

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getCodHistOcor() {
        return codHistOcor;
   }

   public void setCodHistOcor(BigDecimal codHistOcor) {
        this.codHistOcor = codHistOcor;
   }

   public String getDescOcor() {
        return descOcor;
   }

   public void setDescOcor(String descOcor) {
        this.descOcor = descOcor;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtFinalOcor() {
        return dtFinalOcor;
   }

   public void setDtFinalOcor(Timestamp dtFinalOcor) {
        this.dtFinalOcor = dtFinalOcor;
   }

   public Timestamp getDtInicOcor() {
        return dtInicOcor;
   }

   public void setDtInicOcor(Timestamp dtInicOcor) {
        this.dtInicOcor = dtInicOcor;
   }

   public BigDecimal getNuOcor() {
        return nuOcor;
   }

   public void setNuOcor(BigDecimal nuOcor) {
        this.nuOcor = nuOcor;
   }

   public String getRecorrente() {
        return recorrente;
   }

   public void setRecorrente(String recorrente) {
        this.recorrente = recorrente;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getDiasPrevRet() {
        return diasPrevRet;
   }

   public void setDiasPrevRet(BigDecimal diasPrevRet) {
        this.diasPrevRet = diasPrevRet;
   }

   public Timestamp getDtPrevRet() {
        return dtPrevRet;
   }

   public void setDtPrevRet(Timestamp dtPrevRet) {
        this.dtPrevRet = dtPrevRet;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getNuReincid() {
        return nuReincid;
   }

   public void setNuReincid(BigDecimal nuReincid) {
        this.nuReincid = nuReincid;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public String getIndEfeitoRetro() {
        return indEfeitoRetro;
   }

   public void setIndEfeitoRetro(String indEfeitoRetro) {
        this.indEfeitoRetro = indEfeitoRetro;
   }

   public String getForcaDtFim() {
        return forcaDtFim;
   }

   public void setForcaDtFim(String forcaDtFim) {
        this.forcaDtFim = forcaDtFim;
   }

   public BigDecimal getNuFalta() {
        return nuFalta;
   }

   public void setNuFalta(BigDecimal nuFalta) {
        this.nuFalta = nuFalta;
   }

   public BigDecimal getNuManejo() {
        return nuManejo;
   }

   public void setNuManejo(BigDecimal nuManejo) {
        this.nuManejo = nuManejo;
   }

   public BigDecimal getNuOcorOrig() {
        return nuOcorOrig;
   }

   public void setNuOcorOrig(BigDecimal nuOcorOrig) {
        this.nuOcorOrig = nuOcorOrig;
   }

   public BigDecimal getNuProcesso() {
        return nuProcesso;
   }

   public void setNuProcesso(BigDecimal nuProcesso) {
        this.nuProcesso = nuProcesso;
   }

   public BigDecimal getOrigRetif() {
        return origRetif;
   }

   public void setOrigRetif(BigDecimal origRetif) {
        this.origRetif = origRetif;
   }

   public String getReajusteCct() {
        return reajusteCct;
   }

   public void setReajusteCct(String reajusteCct) {
        this.reajusteCct = reajusteCct;
   }

   public String getCid() {
        return cid;
   }

   public void setCid(String cid) {
        this.cid = cid;
   }

   public BigDecimal getCodSind() {
        return codSind;
   }

   public void setCodSind(BigDecimal codSind) {
        this.codSind = codSind;
   }

   public Timestamp getDtInterrompFer() {
        return dtInterrompFer;
   }

   public void setDtInterrompFer(Timestamp dtInterrompFer) {
        this.dtInterrompFer = dtInterrompFer;
   }

   public String getEnvSocial() {
        return envSocial;
   }

   public void setEnvSocial(String envSocial) {
        this.envSocial = envSocial;
   }

   public String getEspecialidade() {
        return especialidade;
   }

   public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
   }

   public String getProcessoCnv() {
        return processoCnv;
   }

   public void setProcessoCnv(String processoCnv) {
        this.processoCnv = processoCnv;
   }

   public BigDecimal getSequenciaCnv() {
        return sequenciaCnv;
   }

   public void setSequenciaCnv(BigDecimal sequenciaCnv) {
        this.sequenciaCnv = sequenciaCnv;
   }

   @Override
   public String getEntityName() {
        return "RegistroOcorrencia";
   }

   @Override
   public RegistroOcorrencia fromVO(DynamicVO vo) {
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codHistOcor = vo.asBigDecimal("CODHISTOCOR");
        this.descOcor = vo.asString("DESCOCOR");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtFinalOcor = vo.asTimestamp("DTFINALOCOR");
        this.dtInicOcor = vo.asTimestamp("DTINICOCOR");
        this.nuOcor = vo.asBigDecimal("NUOCOR");
        this.recorrente = vo.asString("RECORRENTE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.diasPrevRet = vo.asBigDecimal("DIASPREVRET");
        this.dtPrevRet = vo.asTimestamp("DTPREVRET");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuReincid = vo.asBigDecimal("NUREINCID");
        this.digitado = vo.asString("DIGITADO");
        this.indEfeitoRetro = vo.asString("INDEFEITORETRO");
        this.forcaDtFim = vo.asString("FORCADTFIM");
        this.nuFalta = vo.asBigDecimal("NUFALTA");
        this.nuManejo = vo.asBigDecimal("NUMANEJO");
        this.nuOcorOrig = vo.asBigDecimal("NUOCORORIG");
        this.nuProcesso = vo.asBigDecimal("NUPROCESSO");
        this.origRetif = vo.asBigDecimal("ORIGRETIF");
        this.reajusteCct = vo.asString("REAJUSTECCT");
        this.cid = vo.asString("CID");
        this.codSind = vo.asBigDecimal("CODSIND");
        this.dtInterrompFer = vo.asTimestamp("DTINTERROMPFER");
        this.envSocial = vo.asString("ENVSOCIAL");
        this.especialidade = vo.asString("ESPECIALIDADE");
        this.processoCnv = vo.asString("PROCESSOCNV");
        this.sequenciaCnv = vo.asBigDecimal("SEQUENCIACNV");
        return this;
   }
}
