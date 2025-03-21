package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OcorrenciaLiberacao extends AbstractSankhyaEntity<OcorrenciaLiberacao> {
   private BigDecimal grau;
   private String marca;
   private BigDecimal nuAutInv;
   private BigDecimal nuFin;
   private BigDecimal nuMtransf;
   private BigDecimal nuNota;
   private String observacao;
   private String obsLib;
   private String obsLib1;
   private String obsLib2;
   private String obsLib3;
   private BigDecimal sequencia;
   private BigDecimal sequenciaIte;
   private BigDecimal sinal;
   private String status;
   private String tipo;
   private BigDecimal valor;
   private BigDecimal valorOrig;
   private BigDecimal vlrDesdob;
   private BigDecimal codTipOper;
   private BigDecimal codTipParc;
   private BigDecimal codUf;
   private BigDecimal codUsu;
   private BigDecimal codUsuLib;
   private BigDecimal codVend;
   private String controle;
   private BigDecimal dia;
   private BigDecimal codGer;
   private BigDecimal codGrupoProd;
   private BigDecimal codLocal;
   private BigDecimal codMeta;
   private BigDecimal codNat;
   private BigDecimal codPais;
   private BigDecimal codCenCus;
   private BigDecimal codCid;
   private BigDecimal codCtaCtb;
   private BigDecimal codEmp;
   private Timestamp dtAlter;
   private Timestamp dtRef;
   private BigDecimal excluido;
   private BigDecimal codGrupoNat;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codProj;
   private BigDecimal codReg;
   private BigDecimal codCenCusLib;
   private BigDecimal nutVo;

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
        this.marca = marca;
   }

   public BigDecimal getNuAutInv() {
        return nuAutInv;
   }

   public void setNuAutInv(BigDecimal nuAutInv) {
        markAsChanged("NUAUTINV", nuAutInv);
        this.nuAutInv = nuAutInv;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
        this.nuFin = nuFin;
   }

   public BigDecimal getNuMtransf() {
        return nuMtransf;
   }

   public void setNuMtransf(BigDecimal nuMtransf) {
        markAsChanged("NUMTRANSF", nuMtransf);
        this.nuMtransf = nuMtransf;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getObsLib() {
        return obsLib;
   }

   public void setObsLib(String obsLib) {
        markAsChanged("OBSLIB", obsLib);
        this.obsLib = obsLib;
   }

   public String getObsLib1() {
        return obsLib1;
   }

   public void setObsLib1(String obsLib1) {
        markAsChanged("OBSLIB1", obsLib1);
        this.obsLib1 = obsLib1;
   }

   public String getObsLib2() {
        return obsLib2;
   }

   public void setObsLib2(String obsLib2) {
        markAsChanged("OBSLIB2", obsLib2);
        this.obsLib2 = obsLib2;
   }

   public String getObsLib3() {
        return obsLib3;
   }

   public void setObsLib3(String obsLib3) {
        markAsChanged("OBSLIB3", obsLib3);
        this.obsLib3 = obsLib3;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getSequenciaIte() {
        return sequenciaIte;
   }

   public void setSequenciaIte(BigDecimal sequenciaIte) {
        markAsChanged("SEQUENCIAITE", sequenciaIte);
        this.sequenciaIte = sequenciaIte;
   }

   public BigDecimal getSinal() {
        return sinal;
   }

   public void setSinal(BigDecimal sinal) {
        markAsChanged("SINAL", sinal);
        this.sinal = sinal;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   public BigDecimal getValorOrig() {
        return valorOrig;
   }

   public void setValorOrig(BigDecimal valorOrig) {
        markAsChanged("VALOR_ORIG", valorOrig);
        this.valorOrig = valorOrig;
   }

   public BigDecimal getVlrDesdob() {
        return vlrDesdob;
   }

   public void setVlrDesdob(BigDecimal vlrDesdob) {
        markAsChanged("VLRDESDOB", vlrDesdob);
        this.vlrDesdob = vlrDesdob;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
        this.codTipParc = codTipParc;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
        this.codUf = codUf;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuLib() {
        return codUsuLib;
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        markAsChanged("CODUSULIB", codUsuLib);
        this.codUsuLib = codUsuLib;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getDia() {
        return dia;
   }

   public void setDia(BigDecimal dia) {
        markAsChanged("DIA", dia);
        this.dia = dia;
   }

   public BigDecimal getCodGer() {
        return codGer;
   }

   public void setCodGer(BigDecimal codGer) {
        markAsChanged("CODGER", codGer);
        this.codGer = codGer;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
        this.codMeta = codMeta;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public BigDecimal getCodPais() {
        return codPais;
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
        this.codPais = codPais;
   }

   public BigDecimal getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
        this.codCenCus = codCenCus;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public BigDecimal getExcluido() {
        return excluido;
   }

   public void setExcluido(BigDecimal excluido) {
        markAsChanged("EXCLUIDO", excluido);
        this.excluido = excluido;
   }

   public BigDecimal getCodGrupoNat() {
        return codGrupoNat;
   }

   public void setCodGrupoNat(BigDecimal codGrupoNat) {
        markAsChanged("CODGRUPONAT", codGrupoNat);
        this.codGrupoNat = codGrupoNat;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
        this.codReg = codReg;
   }

   public BigDecimal getCodCenCusLib() {
        return codCenCusLib;
   }

   public void setCodCenCusLib(BigDecimal codCenCusLib) {
        markAsChanged("CODCENCUSLIB", codCenCusLib);
        this.codCenCusLib = codCenCusLib;
   }

   public BigDecimal getNutVo() {
        return nutVo;
   }

   public void setNutVo(BigDecimal nutVo) {
        markAsChanged("NUTVO", nutVo);
        this.nutVo = nutVo;
   }

   @Override
   public String getTableName() {
        return "TGMTRA";
   }

   @Override
   public String getEntityName() {
        return "OcorrenciaLiberacao";
   }

   @Override
   public OcorrenciaLiberacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.grau = vo.asBigDecimal("GRAU");
        this.marca = vo.asString("MARCA");
        this.nuAutInv = vo.asBigDecimal("NUAUTINV");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.nuMtransf = vo.asBigDecimal("NUMTRANSF");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.observacao = vo.asString("OBSERVACAO");
        this.obsLib = vo.asString("OBSLIB");
        this.obsLib1 = vo.asString("OBSLIB1");
        this.obsLib2 = vo.asString("OBSLIB2");
        this.obsLib3 = vo.asString("OBSLIB3");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sequenciaIte = vo.asBigDecimal("SEQUENCIAITE");
        this.sinal = vo.asBigDecimal("SINAL");
        this.status = vo.asString("STATUS");
        this.tipo = vo.asString("TIPO");
        this.valor = vo.asBigDecimal("VALOR");
        this.valorOrig = vo.asBigDecimal("VALOR_ORIG");
        this.vlrDesdob = vo.asBigDecimal("VLRDESDOB");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        this.codUf = vo.asBigDecimal("CODUF");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuLib = vo.asBigDecimal("CODUSULIB");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.controle = vo.asString("CONTROLE");
        this.dia = vo.asBigDecimal("DIA");
        this.codGer = vo.asBigDecimal("CODGER");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codPais = vo.asBigDecimal("CODPAIS");
        this.codCenCus = vo.asBigDecimal("CODCENCUS");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtRef = vo.asTimestamp("DTREF");
        this.excluido = vo.asBigDecimal("EXCLUIDO");
        this.codGrupoNat = vo.asBigDecimal("CODGRUPONAT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codReg = vo.asBigDecimal("CODREG");
        this.codCenCusLib = vo.asBigDecimal("CODCENCUSLIB");
        this.nutVo = vo.asBigDecimal("NUTVO");
        return this;
   }
}
