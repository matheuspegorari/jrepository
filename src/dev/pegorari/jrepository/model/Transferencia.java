package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Transferencia extends AbstractSankhyaEntity<Transferencia> {
   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getMarca() {
        return this.getVo().asString("MARCA");
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
   }

   public BigDecimal getNuAutInv() {
        return this.getVo().asBigDecimal("NUAUTINV");
   }

   public void setNuAutInv(BigDecimal nuAutInv) {
        markAsChanged("NUAUTINV", nuAutInv);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getNumTransf() {
        return this.getVo().asBigDecimal("NUMTRANSF");
   }

   public void setNumTransf(BigDecimal numTransf) {
        markAsChanged("NUMTRANSF", numTransf);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getObsLib() {
        return this.getVo().asString("OBSLIB");
   }

   public void setObsLib(String obsLib) {
        markAsChanged("OBSLIB", obsLib);
   }

   public String getObsLib1() {
        return this.getVo().asString("OBSLIB1");
   }

   public void setObsLib1(String obsLib1) {
        markAsChanged("OBSLIB1", obsLib1);
   }

   public String getObsLib2() {
        return this.getVo().asString("OBSLIB2");
   }

   public void setObsLib2(String obsLib2) {
        markAsChanged("OBSLIB2", obsLib2);
   }

   public String getObsLib3() {
        return this.getVo().asString("OBSLIB3");
   }

   public void setObsLib3(String obsLib3) {
        markAsChanged("OBSLIB3", obsLib3);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getSequenciaIte() {
        return this.getVo().asBigDecimal("SEQUENCIAITE");
   }

   public void setSequenciaIte(BigDecimal sequenciaIte) {
        markAsChanged("SEQUENCIAITE", sequenciaIte);
   }

   public BigDecimal getSinal() {
        return this.getVo().asBigDecimal("SINAL");
   }

   public void setSinal(BigDecimal sinal) {
        markAsChanged("SINAL", sinal);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public BigDecimal getValorOrig() {
        return this.getVo().asBigDecimal("VALOR_ORIG");
   }

   public void setValorOrig(BigDecimal valorOrig) {
        markAsChanged("VALOR_ORIG", valorOrig);
   }

   public BigDecimal getVlrDesdob() {
        return this.getVo().asBigDecimal("VLRDESDOB");
   }

   public void setVlrDesdob(BigDecimal vlrDesdob) {
        markAsChanged("VLRDESDOB", vlrDesdob);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipParc() {
        return this.getVo().asBigDecimal("CODTIPPARC");
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuLib() {
        return this.getVo().asBigDecimal("CODUSULIB");
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        markAsChanged("CODUSULIB", codUsuLib);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getDia() {
        return this.getVo().asBigDecimal("DIA");
   }

   public void setDia(BigDecimal dia) {
        markAsChanged("DIA", dia);
   }

   public BigDecimal getCodGer() {
        return this.getVo().asBigDecimal("CODGER");
   }

   public void setCodGer(BigDecimal codGer) {
        markAsChanged("CODGER", codGer);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodPais() {
        return this.getVo().asBigDecimal("CODPAIS");
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
   }

   public BigDecimal getCodCenCus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getExcluido() {
        return this.getVo().asBigDecimal("EXCLUIDO");
   }

   public void setExcluido(BigDecimal excluido) {
        markAsChanged("EXCLUIDO", excluido);
   }

   public BigDecimal getCodGrupoNat() {
        return this.getVo().asBigDecimal("CODGRUPONAT");
   }

   public void setCodGrupoNat(BigDecimal codGrupoNat) {
        markAsChanged("CODGRUPONAT", codGrupoNat);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   public BigDecimal getCodCenCusLib() {
        return this.getVo().asBigDecimal("CODCENCUSLIB");
   }

   public void setCodCenCusLib(BigDecimal codCenCusLib) {
        markAsChanged("CODCENCUSLIB", codCenCusLib);
   }

   public BigDecimal getNutVo() {
        return this.getVo().asBigDecimal("NUTVO");
   }

   public void setNutVo(BigDecimal nutVo) {
        markAsChanged("NUTVO", nutVo);
   }

   @Override
   public String getTableName() {
        return "TGMTRA";
   }

   @Override
   public String getEntityName() {
        return "Transferencia";
   }

   @Override
   public Transferencia fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
