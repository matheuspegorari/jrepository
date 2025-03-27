package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroOcorrencia extends AbstractSankhyaEntity<RegistroOcorrencia> {
   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodHistOcor() {
        return this.getVo().asBigDecimal("CODHISTOCOR");
   }

   public void setCodHistOcor(BigDecimal codHistOcor) {
        markAsChanged("CODHISTOCOR", codHistOcor);
   }

   public String getDescOcor() {
        return this.getVo().asString("DESCROCOR");
   }

   public void setDescOcor(String descOcor) {
        markAsChanged("DESCROCOR", descOcor);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtFinalOcor() {
        return this.getVo().asTimestamp("DTFINALOCOR");
   }

   public void setDtFinalOcor(Timestamp dtFinalOcor) {
        markAsChanged("DTFINALOCOR", dtFinalOcor);
   }

   public Timestamp getDtInicOcor() {
        return this.getVo().asTimestamp("DTINICOCOR");
   }

   public void setDtInicOcor(Timestamp dtInicOcor) {
        markAsChanged("DTINICOCOR", dtInicOcor);
   }

   public BigDecimal getNuOcor() {
        return this.getVo().asBigDecimal("NUOCOR");
   }

   public void setNuOcor(BigDecimal nuOcor) {
        markAsChanged("NUOCOR", nuOcor);
   }

   public String getRecorrente() {
        return this.getVo().asString("RECORRENTE");
   }

   public void setRecorrente(String recorrente) {
        markAsChanged("RECORRENTE", recorrente);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getDiasPrevRet() {
        return this.getVo().asBigDecimal("DIASPREVRET");
   }

   public void setDiasPrevRet(BigDecimal diasPrevRet) {
        markAsChanged("DIASPREVRET", diasPrevRet);
   }

   public Timestamp getDtPrevRet() {
        return this.getVo().asTimestamp("DTPREVRET");
   }

   public void setDtPrevRet(Timestamp dtPrevRet) {
        markAsChanged("DTPREVRET", dtPrevRet);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuReincid() {
        return this.getVo().asBigDecimal("NUREINCID");
   }

   public void setNuReincid(BigDecimal nuReincid) {
        markAsChanged("NUREINCID", nuReincid);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public String getIndEfeitoRetro() {
        return this.getVo().asString("INDEFEITORETRO");
   }

   public void setIndEfeitoRetro(String indEfeitoRetro) {
        markAsChanged("INDEFEITORETRO", indEfeitoRetro);
   }

   public String getForcaDtFim() {
        return this.getVo().asString("FORCADTFIM");
   }

   public void setForcaDtFim(String forcaDtFim) {
        markAsChanged("FORCADTFIM", forcaDtFim);
   }

   public BigDecimal getNuFalta() {
        return this.getVo().asBigDecimal("NUFALTA");
   }

   public void setNuFalta(BigDecimal nuFalta) {
        markAsChanged("NUFALTA", nuFalta);
   }

   public BigDecimal getNuManejo() {
        return this.getVo().asBigDecimal("NUMANEJO");
   }

   public void setNuManejo(BigDecimal nuManejo) {
        markAsChanged("NUMANEJO", nuManejo);
   }

   public BigDecimal getNuOcorOrig() {
        return this.getVo().asBigDecimal("NUOCORORIG");
   }

   public void setNuOcorOrig(BigDecimal nuOcorOrig) {
        markAsChanged("NUOCORORIG", nuOcorOrig);
   }

   public BigDecimal getNuProcesso() {
        return this.getVo().asBigDecimal("NUPROCESSO");
   }

   public void setNuProcesso(BigDecimal nuProcesso) {
        markAsChanged("NUPROCESSO", nuProcesso);
   }

   public BigDecimal getOrigRetif() {
        return this.getVo().asBigDecimal("ORIGRETIF");
   }

   public void setOrigRetif(BigDecimal origRetif) {
        markAsChanged("ORIGRETIF", origRetif);
   }

   public String getReajusteCct() {
        return this.getVo().asString("REAJUSTECCT");
   }

   public void setReajusteCct(String reajusteCct) {
        markAsChanged("REAJUSTECCT", reajusteCct);
   }

   public String getCid() {
        return this.getVo().asString("CID");
   }

   public void setCid(String cid) {
        markAsChanged("CID", cid);
   }

   public BigDecimal getCodSind() {
        return this.getVo().asBigDecimal("CODSIND");
   }

   public void setCodSind(BigDecimal codSind) {
        markAsChanged("CODSIND", codSind);
   }

   public Timestamp getDtInterrompFer() {
        return this.getVo().asTimestamp("DTINTERROMPEFER");
   }

   public void setDtInterrompFer(Timestamp dtInterrompFer) {
        markAsChanged("DTINTERROMPEFER", dtInterrompFer);
   }

   public String getEnvSocial() {
        return this.getVo().asString("ENVESOCIAL");
   }

   public void setEnvSocial(String envSocial) {
        markAsChanged("ENVESOCIAL", envSocial);
   }

   public String getEspecialidade() {
        return this.getVo().asString("ESPECIALIDADE");
   }

   public void setEspecialidade(String especialidade) {
        markAsChanged("ESPECIALIDADE", especialidade);
   }

   public String getProcessoCnv() {
        return this.getVo().asString("PROCESSOCNV");
   }

   public void setProcessoCnv(String processoCnv) {
        markAsChanged("PROCESSOCNV", processoCnv);
   }

   public BigDecimal getSequenciaCnv() {
        return this.getVo().asBigDecimal("SEQUENCIACNV");
   }

   public void setSequenciaCnv(BigDecimal sequenciaCnv) {
        markAsChanged("SEQUENCIACNV", sequenciaCnv);
   }

   @Override
   public String getTableName() {
        return "TFPOCO";
   }

   @Override
   public String getEntityName() {
        return "RegistroOcorrencia";
   }

   @Override
   public RegistroOcorrencia fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
